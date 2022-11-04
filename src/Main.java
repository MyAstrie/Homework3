public class Main {
    public static void task1() {
        System.out.println("\nЗадача 1:");

        int myInt = 2147483647;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);

        byte myByte = 127;
        System.out.println("Значение переменной myByte с типом byte равно " + myByte);

        short myShort = 32767;
        System.out.println("Значение переменной myShort с типом short равно " + myShort);

        long myLong  = 9223372036854775807L;
        System.out.println("Значение переменной myLong с типом long равно " + myLong);

        float myFloat = 3.14f;
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);

        double myDouble = 3.14;
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);
    }

    public static void task2() {
        System.out.println("\nЗадача 2");

        double myDouble = 27.12;
        System.out.println("Значение переменной myDouble с типом double равно " + myDouble);

        long myLong = 987678965549L;
        System.out.println("Значение переменной myLong с типом long равно " + myLong);

        String myString = "2,786";
        System.out.println("Значение переменной myString с типом string равно " + myString);

        boolean isBool = false;
        System.out.println("Значение переменной isBool с типом boolean равно " + isBool);

        short myShort1 = 569;
        System.out.println("Значение переменной myShort с типом short равно " + myShort1);

        short myShort2 = -159;
        System.out.println("Значение переменной myByte с типом byte равно " + myShort2);

        int myInt = 27897;
        System.out.println("Значение переменной myInt с типом int равно " + myInt);

        float myFloat = 67.f;
        System.out.println("Значение переменной myFloat с типом float равно " + myFloat);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");

        int ludmilaTotalStudents = 23;
        int annaTotalStudents = 27;
        int ekaterinaTotalStudents = 30;
        int totalPaper = 480;

        int totalStudents = ludmilaTotalStudents + annaTotalStudents + ekaterinaTotalStudents;
        double paperForStudent = totalPaper / (double)totalStudents;
        System.out.println("На каждого ученика рассчитано " + paperForStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println("\nЗадача 4");

        int bottlePerMin = 16/2;
        int bottlePer20Min = bottlePerMin * 20;
        System.out.println("За 20 минут машины произвела бутылок " + bottlePer20Min + " штук");

        int bottlePer24H = bottlePerMin * 24 * 60;
        System.out.println("За 1 сутки машина произвела бутылок " + bottlePer24H + " штук");

        int bottlePer3Days = bottlePer24H * 3;
        System.out.println("За 3 суток машина произвела бутылок " + bottlePer3Days + " штук");

        int bottlePerMonth = bottlePer24H * 30;
        System.out.println("За Месяц машина произвела бутылок " + bottlePerMonth + " штук");
    }

    public static void task5() {
        System.out.println("\nЗадача 5");

        int totalCanOfPaint = 120;
        int whitePaintForClass = 2;
        int brownPaintForClass = 4;

        int totalPaintForClass = brownPaintForClass + whitePaintForClass;
        double totalClasses = totalCanOfPaint / (double)totalPaintForClass;
        double totalWhitePaint = totalClasses * whitePaintForClass;
        double totalBrownPaint = totalClasses * brownPaintForClass;
        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhitePaint +
                " банок белой краски и " + totalBrownPaint + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println("\nЗадача 6");

        int bananaGr = 5 * 80;
        int milkGr = 2 * 105;
        int iceCreamGr = 2 * 100;
        int eggsGr = 4 * 70;

        int totalGr = bananaGr + milkGr + iceCreamGr + eggsGr;
        double weightKg = totalGr / 1000.0;
        System.out.println("Вес спротзвтрака составляет: " + weightKg + " кг. ");
    }

    public static void task7() {
        System.out.println("\nЗадача 7");

        int dumpWeight = 7;
        int lossOf250Gr = 250;
        int lossOf500Gr = 500;

        double daysIfLoses250Gr = (dumpWeight * 1000) / (double)lossOf250Gr;
        System.out.println("колество дней если бдует терчть по 250 гр. = " + daysIfLoses250Gr);

        double daysIfLoses500Gr = (dumpWeight * 1000) / (double)lossOf500Gr;
        System.out.println("колество дней если бдует терчть по 500 гр. = " + daysIfLoses500Gr);

        double averageDays = (daysIfLoses250Gr + daysIfLoses500Gr) / 2.0;
        System.out.println("В среднем понадбится " + averageDays + " дней");
    }

    public static void task8() {
        System.out.println("\nЗадача 8");

        int mashaZp = 67760;
        int denisZp = 83690;
        int kristinaZp = 76230;

        double newMashaZp = mashaZp * 1.1;
        double newDenisZp = denisZp * 1.1;
        double newKristinaZp = kristinaZp * 1.1;

        double diffMashaZp = newMashaZp * 12 - mashaZp * 12;
        double diffDenisZp = newDenisZp * 12 - denisZp * 12;
        double diffKristinaZp = newKristinaZp * 12 - kristinaZp * 12;

        System.out.println("Маша теперь получает " + newMashaZp + " рублей. "+
                "Годовой доход вырос на " + diffMashaZp + " рублей");

        System.out.println("Денис теперь получает " + newDenisZp + " рублей. "+
                "Годовой доход вырос на " + diffDenisZp + " рублей");

        System.out.println("Кристина теперь получает " + newKristinaZp + " рублей. "+
                "Годовой доход вырос на " + diffKristinaZp + " рублей");
    }

    public static void main(String[] args) {
       task1();
       task2();
       task3();
       task4();
       task5();
       task6();
       task7();
       task8();
    }
}