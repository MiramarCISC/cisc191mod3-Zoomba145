package edu.sdccd.cisc191;

class Rectangle extends Shape implements Measurable {
    public double width;
    public double height;
    public Rectangle(String name, double width, double height) {
        super(name);
        this.width = width;
        this.height = height;
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

}
