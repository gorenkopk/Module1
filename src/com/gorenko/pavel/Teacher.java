package com.gorenko.pavel;

public class Teacher extends Human {

    private Dekan dekan;
    private Student [] students = new Student[5];

    public Teacher(String name, Dekan dekan) {
        super(name);
        teach(true);
        this.dekan = dekan;
    }

    public Dekan getDekan() {
        return dekan;
    }


    @Override
    public String toString() {
        return String.format("teacherName: %s, studyOrTeach: %s, depends on: %s", getName(), getStudyOrTeach(), dekan.getName());
    }
}
