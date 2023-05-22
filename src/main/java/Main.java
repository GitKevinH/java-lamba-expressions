import java.util.function.*;

public class Main {

    //Task 1: Simple Lambda Expressions
        // Create a few simple lambda expressions that perform addition, subtraction, multiplication, and division operations.
        // Test your lambda expressions to make sure they work correctly.

    //Task 2: Lambda Expressions with Functional Interfaces
        // Create your own functional interfaces and use lambda expressions to create instances of them.

    //Task 3: Lambda Expressions with Built-in Functional Interfaces
        // Use lambda expressions with Java's built-in functional interfaces such as Predicate, Function, Consumer, and Supplier.

    public static void main(String[] args) {

        //Task 1:

            //addition
            BiFunction<Integer, Integer, Integer> addition = (x, y) -> x + y;
            System.out.println("Addition lambda expression: 10 + 20 = " + addition.apply(10,20));

            //subtraction
            BiFunction<Integer, Integer, Integer> subtraction = (x, y) -> x - y;
            System.out.println("Subtraction lambda expression: 20 - 10 = " + subtraction.apply(20,10));

            //multiplication
            BiFunction<Integer, Integer, Integer> multiplication = (x, y) -> x * y;
            System.out.println("Multiplication lambda expression: 20 * 10 = " + multiplication.apply(20,10));

            //subtraction
            BiFunction<Double, Double, Double> division = (x, y) -> x / y;
            System.out.println("Division lambda expression: 20 / 10 = " + division.apply(20.0,10.0));


        //Task 2:
            // from the created 'Name' interface

            Numbers addTo = (x,y) -> x += y;

            int addToResult = addTo.makeInto(23,24);
            //System.out.println(addToResult); //testing function

            Numbers multiplyBy = (x,y) -> x *= y;

            int multiplyByResult = multiplyBy.makeInto(2,3);
            //System.out.println(multiplyByResult); //testing function

            Numbers divideBy = (x,y) -> x /= y;

            int divideByResult = divideBy.makeInto(10,2);
            //System.out.println(divideByResult); //testing function


        //Task 3:
            //Predicate
            Predicate<Integer> equalTo20 = (num) -> num == 20;

            System.out.println(equalTo20.test(20)); //testing
            System.out.println(equalTo20.test(10)); //testing

            //Function
            Function<Integer, Integer> doubleAmount = (num) -> num+=num;
            System.out.println(doubleAmount.apply(40)); //testing

            //Consumer

            Consumer<String> printConsumer = (str) -> System.out.println(str);

            printConsumer.accept("tHiS iS a STRING");//testing

            //Supplier

            Supplier<Double> num = () -> Math.random();

            double randoNum = num.get();
            System.out.println("This is a randomly generated number: " + randoNum);






    }
}
