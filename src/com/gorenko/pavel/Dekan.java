package com.gorenko.pavel;

public class Dekan extends Human{
    public Teacher [] teachers;

    public Dekan(String name, Teacher teacher1, Teacher teacher2) {
        super(name);
        teachers = new Teacher[2];
        teachers[0] = teacher1;
        teachers[1] = teacher2;
    }
}
