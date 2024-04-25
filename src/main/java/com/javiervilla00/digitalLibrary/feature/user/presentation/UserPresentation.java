package com.javiervilla00.digitalLibrary.feature.user.presentation;

import com.javiervilla00.digitalLibrary.feature.user.data.UserDataRepository;
import com.javiervilla00.digitalLibrary.feature.user.data.local.*;
import com.javiervilla00.digitalLibrary.feature.user.domain.AddUserUseCase;
import com.javiervilla00.digitalLibrary.feature.user.domain.User;

import java.util.Scanner;

public class UserPresentation {
    static Scanner sc = new Scanner(System.in);

    public static void showNewUser(){
        System.out.println("Introduce el DNI:");
        String dni = sc.nextLine();
        System.out.println("Introduce el nombre:");
        String name = sc.nextLine();
        System.out.println("Introduce los apellidos:");
        String surname = sc.nextLine();
        System.out.println("Introduce la direccion");
        String adress = sc.nextLine();
        System.out.println("Introduce el telefono");
        String phoneNumber = sc.nextLine();
        System.out.println("Introduce el email");
        String email = sc.nextLine();
        System.out.println("Introduce la fecha de nacimiento");
        String dateBorn = sc.nextLine();

        User newUser = new User(dni, name, surname, adress, phoneNumber, email, dateBorn);
        AddUserUseCase newUserUseCase = new AddUserUseCase(new UserDataRepository(new UserFileLocalDataSource()));
        newUserUseCase.execute(newUser);
    }
}
