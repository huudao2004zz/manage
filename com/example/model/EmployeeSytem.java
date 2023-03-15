package com.example.model;

import com.example.entity.Employee;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class CustomException extends Exception {
    private static final long serialVersionUID = 1L;

    public CustomException(String str){
        super();
        System.out.printf(str);
        EmployeeSystem.operations();
    }
}
class EmployeeSystem {
    public static Map<Integer , Employee> map = new HashMap<>();
    public static void addEmployeee(String name, int age , int id){
        Employee emp = new Employee(name,age,id);
        map.put(id,emp);

        operations();
    }

    public static void deleteEmployee(int Empid) throws CustomException {
        if(map.containsKey(Empid)) {
            map.remove(Empid);
            System.out.println("Sucssesfully Delete from the list !!");
        }else {
            throw new CustomException("not found Exception");
        }
        operations();
        }
    public static void searchEmployeee(int Empid) throws CustomException{
        if (map.containsKey(Empid)){
            //map.get(Emid);
            System.out.printf("Employee Details :- " + map.get(Empid));
        }else {
            throw new CustomException("not found Exception");
        }
        operations();
    }
    public static void employeeeList(){
        System.out.printf(map.toString());
    }
    public static void operations(){
        System.out.printf("\n************Empoyee management system ************");
        System.out.printf("\n1. Add Employee\n");
        System.out.printf("2. Delete Employee\n");
        System.out.printf("3. Search Employee\n");
        System.out.printf("4. Employee List\n");

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput == 1 ){
            System.out.printf("Enter Employee Details(Name , age , ID");
            Scanner scanner1 = new Scanner(System.in);

            String name = scanner1.next();
            int age = scanner1.nextInt();
            int id = scanner1.nextInt();

            if(!name.equals("") && age != 0 && id != 0 ){
                addEmployeee(name,age,id);
            }
        }else if (userInput == 2 ){
            System.out.printf("Enter employee id");
            Scanner scanner2 = new Scanner(System.in);

            int Empid = scanner2.nextInt();
            try {
                deleteEmployee(Empid);
            }catch (CustomException e){
                //
            }
        }else if (userInput == 3 ){
            System.out.printf("Enter Employee id");
            Scanner scanner3 = new Scanner(System.in);

            int Empid = scanner3.nextInt();
            try {
                searchEmployeee(Empid);
            }catch (
                    CustomException e
            ){
                //
            }
            operations();
        } else if (userInput == 4 ){
            employeeeList();

            operations();
        }
    }

    public static void main(String[] args) {
        operations();
    }
}
