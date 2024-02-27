@FunctionalInterface
interface Car1 {// contains only one method
//    void drive();
//    void drive(int avg);
    void drive(int avg, int topSpeed);
}
public class LambdaExpression {
    public static void main(String[] args) {

        //no parameter
//        Car1 obj = () -> { //work for only version 8 and above
        //if single line, then code written as below
//            System.out.println("Driving..");
//        };

        //single parameter
//        Car1 obj  = avg-> System.out.println("Average is " + avg);
//        obj.drive(17);

        //multiple parameter
        Car1 obj = ( average,topSpeed)->{
            System.out.println("The top speed of the car is " + topSpeed);
            System.out.println("the average is "+average);
        };
        obj.drive(20,160);
    }
}
