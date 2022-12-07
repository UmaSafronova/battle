package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        short a = in.nextShort();
        short b = in.nextShort();
        double c;
        c = Math.sqrt(a*a + b*b);
        System.out.println(c);
    }
}
