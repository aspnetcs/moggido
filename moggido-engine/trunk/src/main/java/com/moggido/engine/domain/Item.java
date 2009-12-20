package com.moggido.engine.domain;

public class Item {
    /** Id representation of the user */
    private long userId;
    /** Name of the item */
    private String name;
    /** Description of the item */
    private String description;
    /** Image url of the item */
    private String imageURL;
    /** Status of the item */
    private ItemStatus status;

    public Item() {

    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

}
