package com.moggido.service;

/**
 * This class represents response error codes of the service
 *
 * @author ccadete
 *
 */
public enum ResponseCode {
    /** Response is ok */
    OK(0),
    /** An error on the system */
    SYSTEM_ERROR(1),
    /** A user invalid error */
    ERROR(2),
    /** Exceeded the daily requests limit */
    DAILY_LIMITY(3),
    /** API Service not available */
    NOT_AVAILABLE(4);

    /** Lack in parameters Latitude/Longitude */
    // GEO_ERROR(5),
    /** Location is invalid */
    // GEO_BAD_LOCATION(6);

    private final int value;

    public int getValue() {
        return value;
    }

    private ResponseCode(final int value) {
        this.value = value;
    }
}
