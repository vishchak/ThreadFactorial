package com.company;

import java.math.BigInteger;

public class ThreadFactorial implements Runnable {
    private BigInteger result;

    public BigInteger getResult() {
        return result;
    }

    public void setResult(BigInteger result) {
        this.result = result;
    }

    public BigInteger factorial(Thread thread) {
        String s = thread.getName();
        String index = s.replaceAll("[^0-9]", "");
        int n = Integer.parseInt(index.trim());
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }

    @Override
    public void run() {
        Thread thr = Thread.currentThread();
        System.out.println(thr.getName() + " factorial= " + factorial(Thread.currentThread()));
    }
}
