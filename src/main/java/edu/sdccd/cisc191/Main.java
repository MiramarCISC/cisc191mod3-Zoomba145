
package edu.sdccd.cisc191;

import java.util.*;

public class Main {
    public static void main(String[] args){

        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle("A",2));
        shapes.add(new Rectangle("B",3,4));
        shapes.add(new Triangle("C",3,4,5));

        for(Shape s:shapes){
            System.out.println(s.describe() + " area=" + s.area());
        }

        shapes.sort(Comparator.comparingDouble(Shape::area));
        System.out.println("Sorted by area:");
        shapes.forEach(System.out::println);

        /*
        * You forgot to add the demonstration of the equals comparison.
        * You should implement something like this:
        */

        Rectangle first = new Rectangle("same",2, 3);
        Rectangle second = new Rectangle("same",2, 3);
        Rectangle third = new Rectangle("different",8, 9);
        System.out.println(first.equals(second));
        System.out.println(second.equals(first));
        System.out.println(second.equals(third));
    }
}
