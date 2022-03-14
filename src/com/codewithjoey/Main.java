package com.codewithjoey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String message = greetUser("moshy", "mosh");
    }

    public static String greetUser(String firstName, String lastName){
        return "hey " + firstName + " " + lastName + "!";
    }
}
