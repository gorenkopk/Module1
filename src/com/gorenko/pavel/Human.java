package com.gorenko.pavel;

public class Human implements Study{
    private boolean study;
    private boolean teach;
    String name;

    public boolean isStudy() {
        return study;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTeach() {
        return teach;
    }

    public Human(String name) {
        this.name = name;
    }

    public void study(boolean study) {
        this.study = study;
    }

    public void teach(boolean teach) {
        this.teach = teach;
    }
}
