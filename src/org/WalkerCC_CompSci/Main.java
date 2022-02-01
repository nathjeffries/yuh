package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2, 4);
        Square square1 = new Square(3);

        //length of 2
        //width of 4
        System.out.println("The length of rectangle1 is:  " + rectangle1.getLength());
        System.out.println("The width of rectangle1 is:  " + rectangle1.getWidth());

        //sidelength of 3
        System.out.println("The Side Length of square1 is:  " + square1.getSideLength());

        //area of 8
        System.out.println("The area of rectangle1 is: " + rectangle1.Area());


        square1.setSideLength(4);

        //sideLength of 4
        //Area of 16;
        System.out.println("The Side Length of square1 is:  " + square1.getSideLength());
        System.out.println("The area of square1 is: " + square1.Area());




    }
}


