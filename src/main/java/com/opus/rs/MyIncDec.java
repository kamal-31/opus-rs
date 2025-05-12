package com.opus.rs;

public class MyIncDec implements IncDec {
    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    @Override
    public void increment() {
        x++;
    }

    @Override
    public void decrement() {
        x--;
    }

}

