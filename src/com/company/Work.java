package com.company;

public class Work extends University{

    public static void main(String[] args) {
        Main main = new Main();
        University university = new University();

        System.out.println("Сколько было лет, когда Майк поступил в универ");
        System.out.println(university.getCountFour());
        System.out.println("1-й курс окончил");
        university.incrementCounterFour();
        System.out.println("2-й курс окончил");
        university.incrementCounterFour();
        System.out.println("3-й курс окончил с одной пересдачей");
        university.incrementCounterFour();
        System.out.println("4-й курс окончил с двумя пересдачами");
        university.incrementCounterFour();
        System.out.println("5-й курс окончил завалили на дипломе");
        university.incrementCounterFour();
        System.out.println("Сколько лет Майку, когда Майка заставили работать");
        System.out.println(university.getCountFour());

        main.setAge(university.getCountFour());
        int age = main.getAge();
        main.goToWork();
    }
}