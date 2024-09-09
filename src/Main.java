public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1"); // Задание 1
        int a = 32000;
        byte b = 55;
        short c = 19000;
        long d =  3490646074067L;
        float e =  534.544e+2f;
        double f = 4556.284e+2;

        System.out.println("Переменная со значением int равна " + a);
        System.out.println("Переменная со значением byte равна " + b);
        System.out.println("Переменная со значением short равна " + c);
        System.out.println("Переменная со значением long равна " + d);
        System.out.println("Переменная со значением float равна " + e);
        System.out.println("Переменная со значением doble равна " + f);


        System.out.println("Задание 2"); // Задание 2
        float number1 = 27.12f;
        long number2 = 987678965549L;
        float number3 = 2.786f;
        short number4 = 569;
        short number5 = -159;
        short number6 = 27897;
        byte number7 = 67;
        System.out.println("Число 1 = " + number1);
        System.out.println("Число 2 = " + number2);
        System.out.println("Число 3 = " + number3);
        System.out.println("Число 4 = " + number4);
        System.out.println("Число 5 = " + number5);
        System.out.println("Число 6 = " + number6);
        System.out.println("Число 7 = " + number7);


        System.out.println("Задание 3"); // Задание 3
        byte class1 = 23; //Ученики Людмилы Павловны
        byte class2 = 27; //Ученики Анны Сергеевны
        byte class3 = 30; //Ученики Екатерины Андреевны
        short paper = 480; //Куплено бумаги
        byte students = (byte) (class1 + class2 + class3); //Всего учеников
        byte paperForStudent = (byte) (paper/students);
        System.out.println("На каждого ученика расчитано " + paperForStudent + " листов бумаги");


        System.out.println("Задание 4"); //Задание 4
        byte bottle = 16;

        //Количество бутылок в минуту
        byte bottlePerMinute = (byte) (bottle/2);

        short bottle1 = (short) (bottlePerMinute * 20);
        short bottle2 = (short) (bottlePerMinute * 1440);
        int bottle3 = (int) (bottlePerMinute * 4320);
        int bottle4 = (int) (bottlePerMinute * 43800);

        System.out.println("За 20 минут машина произведёт " + bottle1 + " бутылок");
        System.out.println("За сутки машина произведёт " + bottle2 + " бутылок");
        System.out.println("За 3 дня машина произведёт " + bottle3 + " бутылок");
        System.out.println("За месяц машина произведёт " + bottle4 + " бутылок");


        System.out.println("Задание 5"); //Задание 5
        byte whitePaint = 2;
        byte brownPaint = 4;
        byte school = 120; //Краски нужно
        //Краски уходит на 1 кабинет
        byte paint = (byte)(whitePaint + brownPaint);
        //Количество классов в школе
        byte room = (byte) (school/paint);
        byte buyPaint1 = (byte) (room * whitePaint);
        byte buyPaint2 = (byte) (room * brownPaint);
        System.out.println("В школе, где " + room + " классов, нужно " + buyPaint1 + " банок белой краски и " + buyPaint2 + " банок коричневой краски.");


        System.out.println("Задание 6"); // Задание 6
        byte banana = 5; //Кол-во бананов
        byte banana1 = 80; //Масса 1го банана в граммах
        short banana2 = (short) (banana1 * banana); //Масса бананов в граммах

        short milk = 200; //Мл. молока
        short milk1 = 105; //Масса 100 мл молока в граммах
        short milk2 = (short) (milk/100);
        short milk3 = (short) (milk1 * milk2); //Масса молока в граммах

        byte iceСream = 2; //Брикетов мороженного
        byte iceСream1 = 100; //Масса 1го брикета в граммах
        short iceСream2 = (short) (iceСream1 * iceСream); //Масса мороженного в граммах

        byte eggs = 4; //Кол-во яиц
        byte eggs1 = 70; //Масса 1го яйца в граммах
        short eggs2 = (short) (eggs1 * eggs);//Масса мороженного в граммах

        short sportFood = (short) (banana2 + milk3 + iceСream2 + eggs2);

        int grPerKg = 1000;
        float sportFood1 = sportFood/(float)grPerKg;

        System.out.println("Масса спортзавтрака в граммах " + sportFood);
        System.out.println("Масса спортзавтрака в килограммах " + sportFood1);


        System.out.println("Задание 7"); //Задание 7
        byte weight = 7; //Вес спортсмена в килограммах
        short weight1 = (short) (weight * 1000); //Вес в граммах
        short w1 = 250;
        short w2 = 500;
        byte days = (byte) (weight1/w1);
        byte days1 = (byte) (weight1/w2);
        System.out.println("При похудении 250 г в день спортсмену понадобится " + days + " дней");
        System.out.println("При похудении 500 г в день спортсмену понадобится " + days1 + " дней");


        System.out.println("Задание 8"); //Задание 8

        int masha = 67760;
        int den = 83690;
        int kris = 76230;

        //Годовой доход до повышения зарплаты
        int yearMasha = (int) (masha * 12);
        int yearDen = (int) (den * 12);
        int yearKris = (int) (kris * 12);

        //Прибавка к зарплате
        float masha1 = (float) (masha * 0.1f);
        float den1 = (float) (den * 0.1f);
        float kris1 = (float) (kris * 0.1f);

        //Зарплата после увеличения на 10 процентов
        int masha2 = (int) (masha + masha1);
        int den2 = (int) (den + den1);
        int kris2 = (int) (kris + kris1);

        //Годовой доход после повышения зарплаты
        int yearMasha1 = (int) (masha2 * 12);
        int yearDen1 = (int) (den2 * 12);
        int yearKris1 = (int) (kris2 * 12);

        //Прирост дохода
        int increaseMasha = (int) (yearMasha1 - yearMasha);
        int increaseDen = (int) (yearDen1 - yearDen);
        int increaseKris = (int) (yearKris1 - yearKris);
        System.out.println("Маша теперь получает " + masha2 + ". Годовой доход вырос на "+ increaseMasha + " рублей.");
        System.out.println("Денис теперь получает " + den2 + ". Годовой доход вырос на " + increaseDen + " рублей.");
        System.out.println("Кристина теперь получает " + kris2 + ". Годовой доход вырос на " + increaseKris + " рублей.");

    }
}