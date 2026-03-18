package edu.sdccd.cisc191;

import java.util.Objects;

class Rectangle extends Shape implements Measurable {
    public double width;
    public double height;
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;

        //Check if the object created is valid:
        if (height <= 0 || width <= 0 ) {
            throw new IllegalArgumentException("All sides must be bigger than 0");
        } else if (name.isBlank()) {
            throw new IllegalArgumentException("Invalid name");
        }

    }

    @Override
    public double area() {
        return width * height;
    }

    double perimeter() {
        return width * 2 + height * 2;
    }

    public String describe() {
        return "I'm a rectangle called " + name + "!";
    }

    /*
     * You forgot to override equals for the rectangle class.
     *  You should implement something like this:
     */

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(width, rectangle.width) == 0 &&
                Double.compare(height, rectangle.height) == 0 &&
                Objects.equals(name, rectangle.name);
    }
}
