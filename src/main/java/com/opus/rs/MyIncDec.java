package com.opus.rs;

import org.springframework.stereotype.Component;

@Component
public class MyIncDec implements IncDec {
    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    public MyIncDec() {
        x = 5;
    }

    @LogExecutionTime
    @Override
    public void increment() {
        x++;
    }

    @LogExecutionTime
    @Override
    public void decrement() {
        x--;
    }

}

