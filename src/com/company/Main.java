package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Jarek", 56.2);
        Student student2 = new Student("Beata", 98.0);

        System.out.printf("Student %s%s%s%n", student1.getName(), " ocena: ", student1.getOcena());
        System.out.printf("Student %s%s%s%n", student2.getName(), " ocena: ", student2.getOcena());

    }
}
