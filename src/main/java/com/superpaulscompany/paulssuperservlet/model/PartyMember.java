package com.superpaulscompany.paulssuperservlet.model;

public record PartyMember(String name, String surname, int age, String gender,
                          String country, String[] provisions, String[] comments) {
}
