package com.maximum.a05interfacedemo5;

public class Test {
    public static void main(String[] args) {
        PingPongPlayer ppp = new PingPongPlayer("马龙",30);
        System.out.println(ppp.getName() + ", " + ppp.getAge());
        ppp.study();
        ppp.speakEnglish();

        PingPongCoach ppc = new PingPongCoach("刘国梁",30);
        System.out.println(ppc.getName() + ", " + ppc.getAge());
        ppc.speakEnglish();
        ppc.teach();

        BasketballPlayer bp = new BasketballPlayer("Curry",35);
        System.out.println(bp.getName() + ", " + bp.getAge());
        bp.study();

        BasketballCoach bc = new BasketballCoach("科尔",50);
        System.out.println(bc.getName() + ", " + bc.getAge());
        bc.teach();
    }
}
