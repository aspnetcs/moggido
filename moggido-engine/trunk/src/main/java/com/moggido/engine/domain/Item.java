package com.moggido.engine.domain;

public class Item {
    /** Id representation of the user */
    private long userId;
    /** Name of the item */
    private String name;
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

    public ItemStatus getStatus() {
        return status;
    }

    public void setStatus(ItemStatus status) {
        this.status = status;
    }

}
