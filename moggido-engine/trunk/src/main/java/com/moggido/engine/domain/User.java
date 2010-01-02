package com.moggido.engine.domain;

import java.util.Date;

public class User {
    /** Id representation of the user */
    private long id;
    /** Username of the user. It should be unique in the system */
    private String username;
    /** Password of the user */
    private String password;
    /** Created on */
    private Date createdOn;
    /** Status of the user */
    private UserStatus status;
    /** Image url profile */
    private String imageURL;
    /** Email of the user */
    private String email;
    /** API key of the user */
    private String apiKey;

    public User() {
    }

    public long getId() {
        return id;
    }

    public void setid(long userId) {
        this.id = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
