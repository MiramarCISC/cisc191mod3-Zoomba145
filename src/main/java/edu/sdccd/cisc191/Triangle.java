package edu.sdccd.cisc191;

class Triangle extends Shape implements Measurable {
    public double sideOne;
    public double sideTwo;
    public double sideThree;
    public Triangle(String name, double sideOne, double sideTwo, double sideThree) {
        super(name);
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public double area() {
        double s = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(s*(s-sideOne)*(s-sideTwo)*(s-sideThree));
    }

    public double perimeter() {
        return sideOne + sideTwo * sideThree;
    }

    public String describe() {
        return "I'm a triangle called " + name + "!";
    }

}