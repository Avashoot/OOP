class AeroPlane1{
    public void fly(){ //OverridenMethod
        System.out.println("Aeroplane is flying");
    }

    public void takeOff(){// Inherited Method
        System.out.println("Aeroplane TakingOff");
    }
}

class CargoPlane1 extends AeroPlane1{
    public void fly(){// Overriding Method
        System.out.println("Cargo plane flies at Lower height");
    }
    public void takeOff(){
        System.out.println("cargoPlane requires no longer Runway");
    }
}

class PassengerPlane1 extends AeroPlane1{

    public void fly(){ //Overriding Method
        System.out.println("PassengerPlane flies at medium height");
    }
    public void takeOff(){
        System.out.println("PassengerPlane requires medium size Runway");
    }
}

class FighterPlane1 extends AeroPlane1{
    public void fly(){ //Overriding Method
        System.out.println("FighterPlane flies at higher height");
    }
    public void takeOff(){
        System.out.println("FighterPlane requires small size Runway");
    }
}

//Achieving polymorphism using airport class
class AirPort{
    public void poly(AeroPlane1 ref){
        ref.takeOff();
        ref.fly();
        System.out.println("-----------------------------------------");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        CargoPlane1 cp = new CargoPlane1();

        PassengerPlane1 pp = new PassengerPlane1();

        FighterPlane1 fp = new FighterPlane1();

        AirPort a = new AirPort();
        a.poly(cp);
        a.poly(pp);
        a.poly(fp);

//        pp.takeOff();
//        pp.fly();
//
//        cp.takeOff();
//        cp.fly();
//
//        fp.takeOff();
//        fp.fly();


//        AeroPlane1 ref;
//
//        ref = cp;
//        ref.takeOff();
//        ref.fly();
//        System.out.println("--------------------------------------------");
//        ref = pp;
//        ref.takeOff();
//        ref.fly();
    }
}
