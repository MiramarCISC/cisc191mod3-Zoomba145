package edu.sdccd.cisc191;
abstract class Shape implements Comparable<Shape>{
    public String name;

    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public int compareTo(Shape o)
    {
        return this.name.compareTo(o.name);
    }
    abstract double area();
    abstract double perimeter();
    abstract public String describe();
}