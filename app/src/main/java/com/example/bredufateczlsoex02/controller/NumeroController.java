package com.example.bredufateczlsoex02.controller;

public class NumeroController {
    public String soma(int a, int b) {
        return String.valueOf(a + b);
    }

    public String maior(int a, int b) {
        return a > b ? "O número " + a + " é maior que " + b
                : "O número " + b + " é maior que " + a;
    }
}
