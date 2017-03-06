package com.example.android.reportcard;

/**
 * Created by stevenyang on 3/6/17.
 */

public class Grades {

    private String mGrade;
    private String mClassName;

    public Grades(String className, String letterGrade) {
        mClassName = className;
        mGrade = letterGrade;
    }

    public String getClassName() {
        return mClassName;
    }

    public String getGrade() {
        return mGrade;
    }

    @Override
    public String toString() {
        String result = "Class: " + getClassName() + "\nGrade: " + getGrade();
        return result;
    }
}
