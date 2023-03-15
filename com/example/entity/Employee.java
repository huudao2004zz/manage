package com.example.entity;

public class Employee {
        private String name;
        private int age;
        private int employeeid;

        public Employee(String name, int age , int employeeid){
            this.name = name;
            this.age  =age ;
            this.employeeid = employeeid;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public int getEmployeeid() {
            return employeeid;
        }
        public void setEmployeeid(int employeeid) {
            this.employeeid = employeeid;
        }
            @Override
            public  String toString(){
                return "com.example.model.employee [ name =" + name + " , age = " + age +" , employeeid = "+ employeeid + "]";
            }
}

