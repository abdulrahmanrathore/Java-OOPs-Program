package com.company;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public  void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}

class Circle{

}
public class cwh_40_setter_getter {
    public static void main(String[] args) {
        MyEmployee Abdul = new MyEmployee();
//        Abdul.id = 45;
//        Abdul.name = "Abdul Rahman";  --> Throws an error due to private access modifier
        Abdul.setName("Abdul Rahman");
        Abdul.setId(233);
        System.out.println(Abdul.getName());
        System.out.println(Abdul.getId());
    }
}
