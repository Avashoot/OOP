interface Car {
    void drive();
}

//class Wagonar implements Car{
//    public void drive(){
//        System.out.println("Driving...");
//    }
//}

public class AnonymousInnerClass {
    public static void main(String[] args) {
//        Wagonar obj = new Wagonar();
//        obj.drive();


        Car obj = new Car(){
            //this is the anonymous inner class which do not have any name
            // this is single time use class
            //If we want to use multiple time this class object, then we have to create every time new object like this.
            //better version is lambada expression
            public void drive(){
                System.out.println("Drift");
            }
        };
        obj.drive();
    }
}
