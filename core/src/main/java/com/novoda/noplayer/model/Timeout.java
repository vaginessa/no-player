package com.novoda.noplayer.model;

import java.util.concurrent.TimeUnit;

public class Timeout {

    private static final long SECOND_IN_MILLIS = TimeUnit.SECONDS.toMillis(1);
    private final long timeoutInMillis;

    public static Timeout fromSeconds(long timeoutInSeconds) {
        return new Timeout(timeoutInSeconds * SECOND_IN_MILLIS);
    }

    private Timeout(long timeoutInMillis) {
        this.timeoutInMillis = timeoutInMillis;
    }

    public long inMillis() {
        return timeoutInMillis;
    }

}
