package com.company;
import java.lang.reflect.Field;

public class Kindergarten extends Main {

    private static int countTwo = 3;

    public void incrementCounterTwo(){
        countTwo++;
    }
    public int getCountTwo(){
        return countTwo;
    }

    public static void main(String[] args) throws  NoSuchFieldException, IllegalAccessException {
Main main = new Main();

        System.out.println("Сколько было лет, когда родился Майк");
        System.out.println(main.getCount());
        main.incrementCounter();
        main.incrementCounter();
        main.incrementCounter();
        System.out.println("Сколько теперь, когда родился Майк");
        System.out.println(main.getCount());

        main.setAge(main.getCount());
        int age = main.getAge();
        main.goKinderGarten();


    }




        }



  //
//}
