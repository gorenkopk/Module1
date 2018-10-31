package com.gorenko.pavel;

public class Human implements Study{
    private boolean study;
    private boolean teach;
    private String studyOrTeach;
    private String name;

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
        if ((study)) {
            teach(false);
        } else {
            teach(true);
        }
    }

    public void teach(boolean teach) {
        this.teach = teach;
        if ((teach)) {
            setStudyOrTeach("teach");
        } else {
            setStudyOrTeach("study");
        }
    }

    public String getStudyOrTeach() {
        return studyOrTeach;
    }

    public void setStudyOrTeach(String studyOrTeach) {
        this.studyOrTeach = studyOrTeach;
    }
}
