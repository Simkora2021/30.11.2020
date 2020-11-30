package com.company;

public class Main {
 private String name = "Mike";
 private int age = 0 ;
 public int getAge(){
     return age;
 }
 public void setAge(int Age){
     age = Age;
 }

private static int count = 0;

public void incrementCounter(){
    count++;
}
public int getCount(){
    return count;
}

    void goKinderGarten(){
          if(age >= 3){
              System.out.println("Go to kindergarten");
          }

        }
        void goToSchool(){
    if (age>=7){
        System.out.println("go to school");
    }
        }
    void goToUniversity(){
        if (age>=17){
            System.out.println("go to university");
        }
    }
    void goToWork(){
        if (age>=22){
            System.out.println("go to work");
        }
    }
    }

