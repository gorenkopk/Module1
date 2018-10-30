package com.gorenko.pavel;

public class Main {
    public static void main(String[] args) {
        Dekan dekan = new Dekan("Mike", new Teacher());
        System.out.println(dekan.getName());
    }
}
