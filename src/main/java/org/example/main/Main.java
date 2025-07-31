package org.example.main;

import static java.lang.System.out;

import org.example.packageone.ClassOne;
import org.example.packagethree.ClassThree;
import org.example.packagetwo.ClassTwo;

public class Main {
    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();
        ClassThree three = new ClassThree();
        out.println(one.greet());
        out.println(two.greet());
        out.println(three.greet());
    }
}