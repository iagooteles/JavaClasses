package br.edu.mystudies.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Wall wall = new Wall();
        wall.setWidth(-1.25);
        wall.setHeight(1);

        double width = wall.getWidth();
        System.out.println(width);
    }
}