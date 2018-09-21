package com.core;

public final class Student {
    final String pan;

    public Student(String pan) {
        this.pan = pan;
    }

    public String getPan() {
        return pan;
    }
}

class Driver {
    public static void main(String args) {
        Student s = new Student("1234");
        //s.pan = ""; Compile time error
    }
}
