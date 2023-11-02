// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task 1
        int age = 17;
        System.out.println("Если возраст человека равен " + age + "  то ");

        if (age >= 18) {
            System.out.println("он совершеннолетний");
        } else {
            System.out.println("он не достиг совершеннолетия, нужно немного подождать");
        }
        //task 2
        byte temp = 4;
        boolean isCold = temp < 5 ? true : false;

        if (isCold) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        //task 3
        short velocity = 20;
        boolean isTrafikFines = velocity > 60 ? true : false;

        if (isTrafikFines) {
            System.out.println("Если скорость " + velocity + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + velocity + ", то можно ездить спокойно");
        }

        //task 4
        byte manAge = 14;

        if (manAge > 2 && manAge < 6) {
            System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в детский сад");
        } else if (manAge >= 7 && manAge < 17) {
            System.out.println("Если возраст человека равен " + manAge + ", то ему нужно ходить в школу");
        } else if (manAge >= 18 && manAge <= 24) {
            System.out.println("Если возраст человека равен " + manAge + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + manAge + ", то ему пора ходить на работу");
        }

        //task 5
        byte childAge = 8;
        boolean isAdultArround = true;
        boolean canUseAtraction = childAge < 5 || childAge > 5 && childAge < 14 && isAdultArround ? true : false;

        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ",то ему нельзя кататься на аттракционе");
        } else if (canUseAtraction && childAge > 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ",можно кататься на аттракционе в сопровождении ");
        }else if(!isAdultArround) {
            System.out.println("Без взрослого кататся нельзя");
        }else {
            System.out.println("Если возраст ребенка равен " + childAge + ",можно кататься на аттракционе без сопровождения взрослого");
        }

        //task 6
        byte seatPlaceInVagon = 60;
        short peopleInVagon = 59;

        boolean isEmpty = peopleInVagon > seatPlaceInVagon ? false : true;

        if(isEmpty) {
            System.out.println("Вагон остались сидячие места");
        } else {
            System.out.println("Вагон забит,не осталось сидячиx места, только стоячeе,");
        }

        // task 7
        byte one = 1;
        byte two = 2;
        byte three = 3;

        if(one > two && one > three) {
            System.out.println("Число " +  one + " большее");
        } else if (two > one && two > three) {
            System.out.println("Число " + two + " большее");
        } else if (three > two && three > one) {
            System.out.println("Число " +  three + " большее");
        }
    }


}