package com.ase.api.aop;



public class CurrentUser {
    private Long id;
    private boolean myfashionUser;
    private String apiKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isMyfashionUser() {
        return myfashionUser;
    }

    public void setMyfashionUserType(boolean myfashionUser) {
        this.myfashionUser = myfashionUser;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
