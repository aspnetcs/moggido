package com.moggido.engine.domain;

public enum UserStatus {
    ACTIVE(1), DISABLED(2);

    private final int status;

    public int getStatus() {
        return status;
    }

    private UserStatus(final int status) {
        this.status = status;
    }
}
