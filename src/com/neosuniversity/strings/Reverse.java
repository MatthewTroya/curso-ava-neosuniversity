package com.neosuniversity.strings;

public class Reverse {
    public static void main(String[] args) {
        String input = "Hola Mundo Java 11";
        StringBuilder output = new StringBuilder(input);

        System.out.println(input);
        System.out.println(output.reverse());
    }
}
