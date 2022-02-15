package org.WalkerCC_CompSci;

public class Main {

    public static void main(String[] args) {

        Point rectangleStartingPoint = new Point(2,3);
        Rectangle rectangle1 = new Rectangle(rectangleStartingPoint, 4, 5);
        Point squareStartingPoint = new Point(4,4);
        Square square1 = new Square(squareStartingPoint, 5);

        System.out.println("Rectangle1's perimeter is " + rectangle1.GetPerimeter());
        System.out.println("Square1's perimeter is " + square1.GetPerimeter());


    }
}

