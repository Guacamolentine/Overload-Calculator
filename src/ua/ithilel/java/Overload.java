package ua.ithilel.java;
import static ua.ithilel.java.Sum.*;
import static ua.ithilel.java.Sub.*;
import static ua.ithilel.java.Mul.*;
import static ua.ithilel.java.Div.*;

public class Overload {

    public static void main(String[] args) {
        System.out.println(sum(34, 55));
        System.out.println(sum(22.6, 44.98));

        System.out.println(sub(224, 187));
        System.out.println(sub(156.65, 146.4));

        System.out.println(mul(33, 22));
        System.out.println(mul(3.3, 2.2));

        System.out.println(div(99, 3));
        System.out.println(div(145.5, 12.5));
    }
}
