class AeroPlane{
    public void fly(){ //OverridenMethod
        System.out.println("Aeroplane is flying");
    }

    public void takeOff(){// Inherited Method
        System.out.println("Aeroplane TakingOff");
    }
}

class CargoPlane extends AeroPlane{
    public void fly(){// Overriding Method
        System.out.println("Cargo plane flies at Lower height");
    }
    public void carryGoods(){ //specialized Method
        System.out.println("Cargo plane carries Goods");
    }
}

class PassengerPlane extends AeroPlane{

    public void fly(){ //Overriding Method
        System.out.println("PassengerPlane flies at Higher height");
    }
    public void carryPassenger(){ //Specialized Method
        System.out.println("Passenger plane carry Passengers");
    }
}

public class MethodTypesInInheritance {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        cp.takeOff();
        cp.fly();

        PassengerPlane pp = new PassengerPlane();
        pp.takeOff();
        pp.fly();
    }
}
