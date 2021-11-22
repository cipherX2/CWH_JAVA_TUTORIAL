package com.company;

class Animal{
    String class_name;
    Boolean does_bite;
    int teeth;

    public void setClassName(String name){
        this.class_name=name;
    }

    public String getClass_name(){
        return class_name;
    }

    public void setDoes_bite(Boolean ans){
        this.does_bite=ans;
    }

    public Boolean getDoes_bite() {
        return does_bite;
    }

    public void setTeeth(int teeth){
        this.teeth = teeth;
    }

    public int getTeeth(){
        return teeth;
    }

    void printDetails(){
        System.out.println("Class Name: " + class_name);
        System.out.println("Does it bite: " + does_bite);
        System.out.println("Number of teeth: " + teeth);
    }

}

class dog extends Animal{
    Boolean is_friendly = true;
}

public class OOPS_11_Inheritance_Quiz {
    public static void main(String[] args) {
        dog obj = new dog();
        obj.setClassName("Animal");
        obj.setDoes_bite(true);
        obj.setTeeth(64);

        obj.printDetails();
    }
}
