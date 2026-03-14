package edu.sdccd.cisc191;

class Circle extends Shape implements Measurable {
    public double radius;

    @Override
    public int compareTo(Shape o) {
        return super.compareTo(o);
    }

    @Override
    public boolean equals(Object other){
        if((other instanceof Circle) == false){
            return false;
        }
        Circle o = (Circle) other;
        if(this.name.compareTo(o.name) != 0){
            return false;
        }
        if(this.radius != o.radius){
            return false;
        }
        return true;
    }

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return Math.PI * radius * 2;
    }

    public String describe() {
        return "I'm a circle called " + name + "!";
    }

}