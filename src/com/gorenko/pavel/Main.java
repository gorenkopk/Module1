package com.gorenko.pavel;

public class Main {
    public static void main(String[] args) {
        Dekan dekan = new Dekan("David");

        Teacher teacher1 = new Teacher("Mike", dekan);
        dekan.setTeachers(0, teacher1);

        Teacher teacher2 = new Teacher("Arnold", dekan);
        dekan.setTeachers(1, teacher2);

        Student student1 = new Student("Kate", teacher1);
        Student student2 = new Student("Andrew", teacher1);
        Student student3 = new Student("Maks", teacher1);
        Student student4 = new Student("Alice", teacher1);
        Student student5 = new Student("Helena", teacher1);

        Student student6 = new Student("Any", teacher2);
        Student student7 = new Student("Tom", teacher2);
        Student student8 = new Student("Felix", teacher2);
        Student student9 = new Student("Tony", teacher2);
        Student student10 = new Student("Gerrard", teacher2);

        System.out.println(dekan);
        System.out.println(teacher1);
        System.out.println(teacher2);
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);
        System.out.println(student5);
        System.out.println(student6);
        System.out.println(student7);
        System.out.println(student8);
        System.out.println(student9);
        System.out.println(student10);
    }
}
