package com.company;

class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){   //Constructor
        id = 45;
        name = "Abdul Rahman";
    }
    public MyMainEmployee(String myName, int myId){ //Parameterized Constructor.
        id = myId;                                  //or Argument passing Constructor
        name = myName;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class cwh_42_constructors {
    public static void main(String[] args) {
        MyMainEmployee Abdul = new MyMainEmployee("ProgrammingWithAbdul Rahman", 12);
//        Abdul.setName("Abdul Rahman");
//        Abdul.setId(233);
        System.out.println(Abdul.getId());
        System.out.println(Abdul.getName());
    }
}
