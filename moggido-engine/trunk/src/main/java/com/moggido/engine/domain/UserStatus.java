package com.moggido.engine.domain;

public enum UserStatus {
    /** The user was created but need email confirmation */
    INACTIVE(1),
    /** The user is active */
    ACTIVE(2),
    /** The user was deleted from the system */
    DISABLED(3);

    private final int status;

    public int getStatus() {
        return status;
    }

    private UserStatus(final int status) {
        this.status = status;
    }
}
