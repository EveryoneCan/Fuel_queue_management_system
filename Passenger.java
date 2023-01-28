package com.example.task04;

public class Passenger {

    //Create variables as want
    public static String[] array;
    public String firstName;
    public String secondName;
    public String empty;
    public static String vehicleNum;
    public double literRequired;

    public Passenger(int allFuel){

        setfirstName(firstName);
        setfirstName(this.firstName);
        setsecondName(secondName);
        setsecondName(this.secondName);
        setvehicleNum(vehicleNum);
        setvehicleNum(this.vehicleNum);
        setliterRequired(literRequired);
        setliterRequired(this.literRequired);
        setempty(empty);
        setempty(this.empty);
    }

    public Passenger(int i, String empty) {
    }


    private void setempty(String empty) {
        this.empty = "empty";
    }


    public void setfirstName(String firstName){
        this.firstName = firstName;

    }
    public void setsecondName(String secondName){
        this.secondName = secondName;

    }
    public void setvehicleNum(String vehicleNum){
        this.vehicleNum = vehicleNum;

    }
    public void setliterRequired(double literRequired){
        this.literRequired = literRequired;

    }

    public String getfirstName(){
        return firstName;
    }
    public String getsecondName(){
        return secondName;
    }
    public String getvehicleNum(){return vehicleNum;}
    public double getliterRequired(){
        return literRequired;
    }

    public String getempty(){return empty;}
    public String Display(){
        return String.format("%2s,%2s,%2s,%2f,%2s",getfirstName(),getsecondName(),getvehicleNum(),getliterRequired(),getempty());
    }
    public String Displays(){
        return String.format("%2f",getvehicleNum());
    }

    public void setfirstName() {
    }


    public static class array {
        String name;
    }

}
