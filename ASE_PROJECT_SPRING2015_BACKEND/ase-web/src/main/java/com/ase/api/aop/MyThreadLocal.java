package com.ase.api.aop;


public class MyThreadLocal {
    public static final ThreadLocal<CurrentUser> threadLocal = new ThreadLocal<CurrentUser>();

    public static void set(CurrentUser currentUser) {
        threadLocal.set(currentUser);
    }

    public static void unset() {
        threadLocal.remove();
    }

    public static CurrentUser get() {
        return threadLocal.get();
    }
}
