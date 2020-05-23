package com.company;

public class Student {
    private String name;
    private double average;

    public Student(String name, double average) {
        this.name = name;

        if (average > 0.0){
            if (average < 100.0){
                this.average = average;
            }
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAverage(double average){

        if (average > 0.0) {
            if (average < 100.0) {
                this.average = average;
            }
        }
    }

    public double getAverage(){
        return average;
    }

    public String getOcena(){
        String ocena = "";

        if (average >= 90.0){
            ocena = "6";
        }
        else if (average >= 80.0){
            ocena = "5";
        }
        else if (average >= 70.0){
            ocena = "4";
        }
        else if (average >= 60.0){
            ocena = "3";
        }
        else if (average >= 50.0){
            ocena = "2";
        }
        else {
            ocena = "1";
        }

        return ocena;
    }


}
