package com.moggido.engine.domain;

public enum ItemStatus {
    ACTIVE(1), REMOVED(2);

    private final int status;

    public int getStatus() {
        return status;
    }

    private ItemStatus(final int status) {
        this.status = status;
    }
}
