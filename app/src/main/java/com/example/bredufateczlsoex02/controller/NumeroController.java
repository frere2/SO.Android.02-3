package com.example.bredufateczlsoex02.controller;

public class NumeroController {
    public String soma(int a, int b) {
        int sum = 0;
        for (int i = a+1; i < b; i++) {
            if (i % 2 != 0) sum += i;
        }

        return String.valueOf(sum);
    }

    public String maior(int a, int b) {
        return a > b ? "O número " + a + " é maior que " + b
                : "O número " + b + " é maior que " + a;
    }
}
