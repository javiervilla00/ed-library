package com.javiervilla00.digitalLibrary.feature.user.domain;

public class User {
    public final String dni;
    public final String name;
    public final String surname;
    public final String adress;
    public final String phoneNumber;
    public final String email;
    public final String dateBorn;

    public User(String dni, String name, String surname, String adress, String phoneNumber, String email, String dateBorn) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.dateBorn = dateBorn;
    }
}
