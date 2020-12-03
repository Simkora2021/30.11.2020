package com.company;

public class School extends Kindergarten{
    private static int countThree = 7;

    public void incrementCounterThree(){
        countThree++;
    }
    public int getCountThree(){
        return countThree;
    }
    public static void main(String[] args) {
        Main main = new Main();
        Kindergarten kindergarten = new Kindergarten();

        System.out.println("Сколько было лет, когда "+ main.getName() + " пошёл в садик");
        System.out.println(kindergarten.getCountTwo());
        kindergarten.incrementCounterTwo();
        kindergarten.incrementCounterTwo();
        kindergarten.incrementCounterTwo();
        kindergarten.incrementCounterTwo();
        System.out.println("Сколько лет Майку, когда "+ main.getName()+ " Майка отправляют в школу");
        System.out.println(kindergarten.getCountTwo());

        main.setAge(kindergarten.getCountTwo());
        int age = main.getAge();
        main.goToSchool();

    }
    class ExpirienceLearn extends ExpirienceConsider{
        String Learn(String learn){
            learn = "изучил всё необходимое";
            return learn;
        }
    }
    public  class AddFriendsThree extends AddFriendsTwo{

        @Override
        public void AddFriends(){
            System.out.println("+3 друга");
            System.out.println("перестал общаться с Мишей");
        }
    }
    public class NewFriendThree extends NewFriend{
        public NewFriendThree(int howManyFriend){
            super(howManyFriend);
        }
    }
}