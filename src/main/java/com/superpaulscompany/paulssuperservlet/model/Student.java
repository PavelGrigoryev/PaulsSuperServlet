package com.superpaulscompany.paulssuperservlet.model;

public record Student(int id, String studentsName, String studentsSurname) {

    @Override
    public String toString() {
        return "Student : " +
                "ID = " + id +
                ", Name = " + studentsName +
                ", Surname = " + studentsSurname;
    }
}
