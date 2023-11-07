// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
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

        // task 1, 2
        int clientOS = 0;
        final int iOS = 0;
        final int Android = 1;

        int clientDeviceYear = 2010;

        boolean needLightVersion = clientDeviceYear < 2015;

        if (clientOS == iOS && !needLightVersion) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == Android && !needLightVersion) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == iOS && needLightVersion) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == Android && needLightVersion) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // task 3
        int year = 1900;

        boolean isLeapYear =
                (year >= 1584) &&
                (year % 4 == 0) &&
                (year % 100 != 0) ||
                (year % 400 == 0) ?
                true : false;

        if (isLeapYear) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println( year + " год не является високосным");
        }


        //task 4
        int deliveryDistance = 95;
        byte deliveryDays = 1;
        if(deliveryDistance <=20) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 20 && deliveryDistance <=60 ) {
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            System.out.println("Доставки нет");
        }

        //task 5
        byte monthNumber = 6;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
      */
        // cicle homework
        //task 1

        for(int i =1; i <= 10; i++) {
            System.out.println(i);
        }

        // task 2
        for(int j = 10; j>=1; j--) {
            System.out.println(j);
        }

        //task 3
        for(int i = 0; i < 17; i+=2) {
            System.out.println(i);
        }
        // task 4
        for(int i = 10; i >=-10; i--) {
            System.out.println(i);
        }
        // task 5
        for(int i = 1904; i <= 2096; i+=4) {
            System.out.println(i + " год является високосным");
        }
        //task 6
        for(int i = 7; i <=98; i += 7) {
            System.out.println(i);
        }

        //task 7
        for(int i = 1; i <=512; i += i) {
            System.out.println(i);
        }

        //task 8-9
        int investMoney = 0;
        for(int i = 1; i <=12; i++, investMoney = investMoney + investMoney/100) {
            investMoney += 29000;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + investMoney + " рублей");
        }

        // task 10
        for(int i = 1; i <=10; i++) {
            System.out.println(i * 2);
        }

        // harder task 1

        for(int i = 1; i<= 30; i++){
            boolean isPing = i%3 == 0 ? true : false;
            boolean isPong = i%5 == 0 ? true : false;

            if(isPing && isPong){
                System.out.println(i + ": ping pong");
            } else if(isPong) {
                System.out.println(i + ": pong");
            } else if(isPing) {
                System.out.println(i + ": ping");
            }
        }

        // harder task 2

        for(int i = 0, fbn1 = 0, fbn2 = 1, fb = 0 ;
            i < 10;
            i++, fb = fbn1 + fbn2, fbn1 = fbn2, fbn2 = fb ) {
        System.out.print(fbn1 + " ");
        }
    }


}