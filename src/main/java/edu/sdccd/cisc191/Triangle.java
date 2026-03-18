package edu.sdccd.cisc191;

import java.util.Objects;

class Triangle extends Shape implements Measurable {
    public double sideOne;
    public double sideTwo;
    public double sideThree;
    public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
        super(name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;

        if (sideOne <= 0 || sideTwo <= 0 || sideThree <= 0) {
            throw new IllegalArgumentException("All sides must be bigger than 0");
        } else if (name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }
    }

    @Override
    public double area() {
        double s = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
    }

    public double perimeter() {
        return sideOne + sideTwo * sideThree;
        /*
        * Your math for the perimeter is wrong as you multiply one of the sides.
        * Instead, you should do this:
        *
        * return sideOne + sideTwo + sideThree;
        */
    }

    public String describe() {
        return "I'm a triangle called " + name + "!";
    }

    /*
    * You forgot to override equals for Triangle.java
    * So you should implement something like this:
    */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle)  o;
        return Double.compare(sideOne, triangle.sideOne) == 0 &&
                Double.compare(sideTwo, triangle.sideTwo) == 0 &&
                Double.compare(sideThree, triangle.sideThree) == 0 &&
                Objects.equals(name, triangle.name);
    }

}