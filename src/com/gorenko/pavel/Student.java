package com.gorenko.pavel;

public class Student extends Human{

    private Teacher teacher;

    public Student(String name, Teacher teacher) {
        super(name);
        this.teacher = teacher;
        teach(false);
    }

    @Override
    public String toString() {
        return String.format("studentName: %s, studyOrTeach: %s, depends on: %s", getName(), getStudyOrTeach(), teacher.getName());
    }
}
