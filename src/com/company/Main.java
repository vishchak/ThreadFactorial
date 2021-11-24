package com.company;

public class Main {

    public static void main(String[] args) {
        ThreadFactorial task1 = new ThreadFactorial();
        Thread[] threads = new Thread[100];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(task1);
            threads[i].start();
        }
    }
}
