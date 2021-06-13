package com.ivan.polovyi.prototypepattern;

import javafx.geometry.Point3D;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Swordsman swordsman1 = new Swordsman();
        swordsman1.move(new Point3D(-10, 0, 0), 20);
        swordsman1.attack();
        System.out.println("swordsman1 = " + swordsman1);

        Swordsman swordsman2 = (Swordsman) swordsman1.clone();
        System.out.println("swordsman2 = " + swordsman2);


    }

}
