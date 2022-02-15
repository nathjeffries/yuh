package org.WalkerCC_CompSci;

import javafx.geometry.Side;

import java.sql.SQLOutput;

import static java.lang.Math.sqrt;

public abstract class Shape {

    protected Point[] listOfPoints;

    public double GetSideLength(int sideLengthNumber){
        if(sideLengthNumber >= listOfPoints.length - 1){
            return CalculateSideLength(listOfPoints[listOfPoints.length - 1], listOfPoints[0]);
        }
        else if(sideLengthNumber < 0){
            return CalculateSideLength(listOfPoints[0], listOfPoints[1]);
        }
        else{
            return CalculateSideLength(listOfPoints[sideLengthNumber], listOfPoints[sideLengthNumber + 1]);
        }
    }

    private double CalculateSideLength(Point point0, Point point1){
        //Does the GetSideLength math work stuff
return Math.sqrt((point0.getY()-point1.getY())*(point0.getY()-point1.getY())+(point0.getX()-point1.getX())*(point0.getX()-point1.getX()));
    }

    public double GetPerimeter(){
        //Does the Perimeter Math Work Stuff
return GetSideLength(4);
    }



}