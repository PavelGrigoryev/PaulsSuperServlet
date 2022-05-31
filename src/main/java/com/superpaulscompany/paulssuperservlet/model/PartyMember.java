package com.superpaulscompany.paulssuperservlet.model;

public record PartyMember(String name, String surname, int age, String email, String gender,
                          String country, String nationality, String[] provisions, String comments) {
}

