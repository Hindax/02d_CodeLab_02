package com.cc.java;

public class Mitarbeiter {
    private String familyName;
    private String firstName;
    private String role;
    private int yearOfEntry;

    public Mitarbeiter(String familyName, String firstName, String role, int yearOfEntry) {
        this.familyName = familyName;
        this.firstName = firstName;
        this.role = role;
        this.yearOfEntry = yearOfEntry;
    }

    public String getInfo(String flag) {
        switch (flag) {
            case "#familyName":
                return familyName;

            case "#firstName":
                return firstName;

            case "#role":
                return role;

            case "#yearOfEntry":
                return Integer.toString(yearOfEntry);

            default:
                return "ERROR";
        }

    }

}
