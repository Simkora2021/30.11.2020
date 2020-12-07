package com.company;
import java.lang.reflect.Field;

public class Kindergarten extends Main {

    private int countTwo = 3;

    public void incrementCounterTwo(){
        countTwo++;
    }
    public int getCountTwo(){
        return countTwo;
    }

    private int mark=8;
    public int getMark(){


        return mark;
    }

    public void setMark(int Mark){
        mark = Mark;
    }


    public static void main(String[] args) throws  NoSuchFieldException, IllegalAccessException {
Main main = new Main();
Kindergarten kindergarten = new Kindergarten();
        System.out.println("Сколько было лет, когда родился "+ main.getName());
        System.out.println(main.getCount());
        System.out.println(main.getName()+" понял, что нужно хорошо учиться и получать хорошие оценки");
        main.incrementCounter();
        main.incrementCounter();
        main.incrementCounter();
        System.out.println("по окончанию садика "+main.getName()+" получил средний бал "+kindergarten.getMark());
        System.out.println("Сколько теперь, когда родился " + main.getName());
        System.out.println(main.getCount());

        main.setAge(main.getCount());
        int age = main.getAge();
        main.goKinderGarten();


    }
    class ExpirienceConsider extends ExpirienceRead{
        String Consider(String consider){
            consider = "Научился считать";
            return consider;
        }
    }

  public  class AddFriendsTwo extends AddFriends{

      @Override
       public void AddFriends(){

            System.out.println("+1 друг Миша");
        }


        }
public class NewFriend extends Friend{
        public NewFriend(int howManyFriend){
            super(howManyFriend);
        }
}

    }