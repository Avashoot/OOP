interface Computer{
    void compileCode();
}

class Laptop implements Computer{
    public void compileCode(){
        System.out.println("You got an error");
    }
}

class Desktop implements Computer{
    public void compileCode(){
        System.out.println("You got an error");
    }
}

class Developer{
    //Laptop lap = new Laptop();// instead of here create object in main method for decrease the dependency
    public void buildApp(Computer lap){
        System.out.println("Build an Application");
//        Laptop lap = new Laptop();// multiple object get created at every time calling the method for solving the problem we create the object outside the method
        lap.compileCode();
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        //Laptop lap = new Laptop();//creating the object in main method and passing the object through buildApp method
        Computer desk = new Laptop();
        Developer dev = new Developer();
        dev.buildApp(desk);
    }
}
