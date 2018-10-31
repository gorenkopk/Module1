package com.gorenko.pavel;

public class Dekan extends Human{
    private Teacher [] teachers = new Teacher[2];

    public Dekan(String name) {
        super(name);
        teach(true);
    }

    public void setTeachers(int index, Teacher teacher) {
        this.teachers[index] = teacher;
    }

    @Override
    public String toString() {
        return String.format("DekanName: %s, studyOrTeach: %s", getName(), getStudyOrTeach());
    }
}
