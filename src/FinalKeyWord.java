//final class Animal2{
//    public void sleep(){
//        System.out.println("animal is sleeping");
//    }
//}

class Animal2{

    final int a =20;
    final public void sleep(){
//        a =30;  we cannot modify the final variable it just act like the constant
        System.out.println("animal is sleeping");
    }
    
}

class Tiger2 extends Animal2 /*   : final class will not participate in inheritance*/{
        // we cannot override the final method in child class we can just inherit it
    //    public void sleep(){

    //    }

}
public class FinalKeyWord {
    public static void main(String[] args) {
        Tiger2 t = new Tiger2();
        t.sleep();
    }
}
