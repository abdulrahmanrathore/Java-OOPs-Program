package com.company;

class Employee1{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }

    public int getSalary() {
        return salary;
    }
}

public class cwh_38_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee1 Abdul = new Employee1(); // Instantiating a new Employee Object
        Employee1 John = new Employee1();
        // Setting Attributes for Abdul Rahman
        Abdul.id = 100;
        Abdul.salary = 34;
        Abdul.name = "AbdulRahman";

        //Setting Attributes for John
        John.id = 17;
        John.salary = 12;
        John.name = "John Khandelwal";

        //Printing the Attributes
        Abdul.printDetails();
        John.printDetails();
        int salary = John.getSalary();
        System.out.println(salary);

//        System.out.println(Abdul.id);
//        System.out.println(Abdul.name);
    }
}

