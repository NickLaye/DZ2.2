package com.company;

public class GriffindorStudent extends HogwartsStudent {

    private int nobility;
    private int bravery;
    private int honor;

    public GriffindorStudent(String name, int magic, int transgression, int nobility, int bravery, int honor) {
        super(name, magic, transgression);
        this.nobility = nobility;
        this.bravery = bravery;
        this.honor = honor;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }



    public int ability() {
        return nobility + bravery + honor;
    }

    public void compareGriffindor(GriffindorStudent griffindorStudent) {
        int ability1 = ability();
        int ability2 = griffindorStudent.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше студента %s%n", getName(), griffindorStudent.getName());
        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше студента %s%n", griffindorStudent.getName(), getName());
        } else {
            System.out.printf("Студент %s такой же, как %s%n", griffindorStudent.getName(), getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; благородство: %d; честь: %d; храбрость: %d;", super.toString(), nobility, honor, bravery);
    }
}
