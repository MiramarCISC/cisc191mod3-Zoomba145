package edu.sdccd.cisc191;

//Shape doesn't implement measurable, needs to implement it an override area()
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

    /*
    * Describe is not supposed to be abstract.
    * If you change your implementation you can also avoid having to override it on
    * each child class:
    *
    * public String describe(){
    * return String.format("I'm a %s called %s!",
    *           getClass().getSimpleName(), name);
    * }
    */
    abstract public String describe();

    /*
    * You forgot to override toString so when you print an object it
    * shows something like this: edu.sdccd.cisc191.Triangle@31befd9f
    * You should implement something like this instead:
    */

    @Override
    public String toString() {
        return String.format("%s { name = '%s', perimeter = %f, area = % f}",
                getClass().getSimpleName(), name, perimeter(), area());
    }
}