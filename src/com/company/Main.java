package com.company;

import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {

        GriffindorStudent harry = new GriffindorStudent("Гарри Поттер", generate(), generate(), generate(), generate(), generate());
        GriffindorStudent germiona = new GriffindorStudent("Гермиона Грейнджер", generate(), generate(), generate(), generate(), generate());
        GriffindorStudent ron = new GriffindorStudent("Рон Уизли", generate(), generate(), generate(), generate(), generate());
        SlytherinStudent drako = new SlytherinStudent("Драко Малфой", generate(), generate(), generate(), generate(), generate(),generate(), generate());
        SlytherinStudent grehem = new SlytherinStudent("Грэхэм Монтегю", generate(), generate(), generate(), generate(), generate(),generate(), generate());
        SlytherinStudent gregory = new SlytherinStudent("Грегори Гойл", generate(), generate(), generate(), generate(), generate(),generate(), generate());
        HufflepuffStudent zaharia = new HufflepuffStudent("Захария Смит", generate(), generate(), generate(), generate(), generate());
        HufflepuffStudent sedrik = new HufflepuffStudent("Седрик Диггори", generate(), generate(), generate(), generate(), generate());
        HufflepuffStudent jastin = new HufflepuffStudent("Джастин Финч-Флетчли", generate(), generate(), generate(), generate(), generate());
        RavenclawStudent jou = new RavenclawStudent("Чжоу Чанг", generate(), generate(), generate(),generate(),generate(),generate());
        RavenclawStudent padma = new RavenclawStudent("Падма Патил", generate(), generate(), generate(),generate(),generate(),generate());
        RavenclawStudent marcus = new RavenclawStudent("Маркус Белби", generate(), generate(), generate(),generate(),generate(),generate());

        System.out.println(harry);
        System.out.println(germiona);
        System.out.println(ron);
        System.out.println(drako);
        System.out.println(grehem);
        System.out.println(gregory);
        System.out.println(zaharia);
        System.out.println(sedrik);
        System.out.println(jastin);
        System.out.println(jou);
        System.out.println(padma);
        System.out.println(marcus);

        harry.compareMagic(drako);
        harry.compareGriffindor(ron);
    }

    public static int generate() {
        return RANDOM.nextInt(100);
    }


}
