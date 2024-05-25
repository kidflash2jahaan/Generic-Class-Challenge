package com.system_err;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Park(new double[]{1, 1}, "Gyatt Park").map());
        System.out.println(new River(new double[][]{{2, 2}, {3, 3}}, "Gyatt River").map());
    }
}