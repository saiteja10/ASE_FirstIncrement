package com.ase.bean;

import org.codehaus.jackson.map.ObjectMapper;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(namespace = "ase")
public class SuperDTO {
    private Boolean success = true;
    private String message;

    public Boolean isSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String toJsonString() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(this);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }
}
