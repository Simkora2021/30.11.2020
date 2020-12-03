package com.company;

public class Main {  // Start life
 private String name = "Mike";
    public String getName(){
        return name;
    }
    public void setName(String Name){
        name = Name;
    }
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
    class ExpirienceRead{
    String Read(String read){
        read = "Научился читать";
        return read;
    }
    }
public class AddFriends{


    public void AddFriends(){

        System.out.println("Нет друзей до садика");
    }
}
public class Friend{
    private int howManyFriend = 0;

    public Friend(int howManyFriend) {
    }

    public int getHowManyFriend() {
        return howManyFriend;
    }

    public void setHowManyFriend(int howManyFriend) {
        this.howManyFriend = howManyFriend;
    }
}



    }

