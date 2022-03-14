package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        try {
            System.out.println(Days.valueOf(input.toUpperCase(Locale.ROOT)));
        }
        catch(IllegalArgumentException e) {
            System.out.println(input + " degen kun jok");
        }
    }
}
