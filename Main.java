package com.company;

public class Main {

    public static void main(String[] args) {
        Time time1 = new Time("00:00");
        Time time2 = new Time("12:00");
        Time time3 = new Time("04:05");
        Time time4 = new Time("10:15");
        Time time5 = new Time("23:59");
        Time time6 = new Time("00:35");

        Time wrong1 = new Time("7:56");
        Time wrong2 = new Time("15:78");
        Time wrong3 = new Time("08:60");
        Time wrong4 = new Time("24:00");
        Time wrong5 = new Time("3e:33");
        Time wrong6 = new Time("1:111");


        System.out.println("try1: " +time1.toString());
        System.out.println("try2: " +time2.toString());
        System.out.println("try3: " +time3.toString());
        System.out.println("try4: " +time4.toString());
        System.out.println("try5: " +time5.toString());
        System.out.println("try6: " +time6.toString());
        System.out.println("--------------------");
        System.out.println("mistake1: " +wrong1.toString());
        System.out.println("mistake2: " +wrong2.toString());
        System.out.println("mistake3: " +wrong3.toString());
        System.out.println("mistake4: " +wrong4.toString());
        System.out.println("mistake5: " +wrong5.toString());
        System.out.println("mistake6: " +wrong6.toString());
    }
}
