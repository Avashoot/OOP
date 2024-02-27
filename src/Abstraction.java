abstract class AeroPlane2{

//    abstract int a;
    // we can not make an abstract variable or an abstract constructor
    // bcoz constructor already contains the super method with its body
    abstract public void fly();

    abstract public void takeOff();

    // Not 100% abstraction some methods are abstract methods and some are not
    // in abstract class we can write both types of methods like Abstract and also like non-abstract
    // we can achieve 100% abstraction using interface
    // therefore abstract class is such class which has at least ONE abstract methode
    public void landing (){
        System.out.println("Plane is Landing.");
    }

}

class CargoPlane2 extends AeroPlane2{
    public void fly(){// Overriding Method
        System.out.println("Cargo plane flies at Lower height");
    }
    public void takeOff(){
        System.out.println("cargoPlane requires no longer Runway");
    }

    public void alert(){
        System.out.println("Alert...");
    }
}

class PassengerPlane2 extends AeroPlane2{

    public void fly(){ //Overriding Method
        System.out.println("PassengerPlane flies at medium height");
    }
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size Runway");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        AeroPlane2 cp = new CargoPlane2();
        cp.takeOff();
        cp.fly();
        cp.landing();
//        cp.alert();  we cannot use parent class object reference for specialized methods
        ((CargoPlane2) cp).alert(); //with the down casting we can use parent class object reference


        AeroPlane2 pp = new PassengerPlane2();
        pp.takeOff();
        pp.fly();
        pp.landing();

//        AeroPlane1  ap = new AeroPlane2();
        // we can not able to make the object of abstract class
    }
}
