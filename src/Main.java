import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 17;
        if ( age >= 18) {
            System.out.println(" Если возраст человека равен " + age + ", то он совершеннолетний.");
        } else {
             System.out.println(" Если возраст человека равен " + age + ", то он  не достиг совершеннолетия, нужно немного подождать.");
        }

        // Задача 2
        int temperature = 4;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку.");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки.");
        }

        // Задача 3
        int speed = 61;
        if (speed > 60) {
            System.out.println(" Если скорость " + speed + ", то придётся заплатить штраф.");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно.");
        }

        // Задача 4
        int ageOfThePerson = 1;

        if (ageOfThePerson >= 2 && ageOfThePerson <= 6)  {
            System.out.println(" Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в детский сад.");
        }

        if (ageOfThePerson >= 7 && ageOfThePerson <= 17) {
           System.out.println(" Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в школу.");
        }

        if (ageOfThePerson >= 18 && ageOfThePerson <= 24) {
            System.out.println(" Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить в университете.");

        } else {
            System.out.println(" Если возраст человека равен " + ageOfThePerson + ", то ему нужно ходить на работу.");
        }


        // Задача 5

        int ageOfTheChild = 20;

        if (ageOfTheChild < 5) {
            System.out.println(" Если возраст ребенка равен " + ageOfTheChild + ", то ему нельзя кататься на аттракционе.");
        }

        else if (ageOfTheChild >= 5 && ageOfTheChild  < 14 ) {
            System.out.println(" Если возраст ребенка равен " + ageOfTheChild + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя." );

        } else {
            System.out.println( "Если возраст ребенка равен " + ageOfTheChild + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
        }

        // Задача 6


        int wagonCapacity = 102;
        int seatingCapacity = 60;
        int numberOfOccupiedSeats = 50;
        int numberOfOccupiedStandingPlaces = 10 ;

        int Person = numberOfOccupiedSeats + numberOfOccupiedStandingPlaces;

        if (Person > wagonCapacity) {
            System.out.println(" Мест в вагоне, сидячих и стоячих больше нет.");
        }

        if (Person >=  seatingCapacity) {
            System.out.println(" Мест в вагоне, сидячих больше нет.");
        } else {
            System.out.println(" Есть места.");
        }

        // Задача 7

        int one = 920;
        int two = 1000;
        int three = 96;

        if (two > one && two > three) {
            System.out.println(" Наибольшее число: " + two);
        }
        if (one > two && one > three ) {
                System.out.println(" Наибольшее число: " + one);

        } else if (three > two && three > one) {
            System.out.println(" Наибольшее число: " + three);
        }

    }
}