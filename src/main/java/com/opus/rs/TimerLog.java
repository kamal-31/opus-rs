package com.opus.rs;

import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.time.Instant;

@Slf4j
public class TimerLog {

    public static void main(String[] args) {
        var myIncDec = new MyIncDec(5);
        var start = Instant.now();
        myIncDec.increment();
        var end = Instant.now();
        var duration = Duration.between(start, end);
        log.info("Increment took {} nanos", duration.toNanos());

        start = Instant.now();
        myIncDec.decrement();
        end = Instant.now();
        duration = Duration.between(start, end);
        log.info("Decrement took {} nanos", duration.toNanos());

    }
}
