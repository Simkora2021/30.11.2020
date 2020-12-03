package com.company;

public class University extends School{
    private static int countFour = 17;

    public void incrementCounterFour(){
        countFour++;
    }
    public int getCountFour(){
        return countFour;
    }
    public static void main(String[] args) {
        Main main = new Main();
        School school = new School();

        System.out.print("Сколько было лет, когда Майк пошёл в школу ");
        System.out.println(school.getCountThree());
        System.out.println("1-й класс окончил");
        school.incrementCounterThree();
        System.out.println("2-й класс окончил");
        school.incrementCounterThree();
        System.out.println("3-й класс окончил");
        school.incrementCounterThree();
        System.out.println("4-й класс окончил");
        school.incrementCounterThree();
        System.out.println("5-й класс окончил");
        school.incrementCounterThree();
        System.out.println("6-й класс окончил");
        school.incrementCounterThree();
        System.out.println("7-й класс окончил");
        school.incrementCounterThree();
        System.out.println("8-й класс окончил");
        school.incrementCounterThree();
        System.out.println("9-й класс окончил");
        school.incrementCounterThree();
        System.out.println("10-й класс окончил");
        school.incrementCounterThree();
        System.out.println("11-й класс окончил");
        System.out.print("Сколько лет Майку, когда Майк решил поступить в универ ");
        System.out.println(school.getCountThree());

        main.setAge(school.getCountThree());
        int age = main.getAge();
        main.goToUniversity();

    }
    class ExpirienceThink extends ExpirienceLearn{
        String Think(String think){
            think = "Научился мыслить";
            return think;
        }
    }
    public  class AddFriendsFour extends AddFriendsThree{

        @Override
        public void AddFriends(){
            System.out.println("+23 друга за последний месяц");
            System.out.println("дружит со всеми по месяцу");
        }
    }
}
