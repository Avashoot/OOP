interface Features{
    void show();
    //we can define the methods in interface in Java version 8 and above using default keyword and static keyword
    default void config(){
        System.out.println("In interface in config");
    }
    static void abc(){
        System.out.println("in abc");
    }
}

class Java8 implements Features{
    public void show(){
        System.out.println("in show in class Java8");
    }
}

public class Java8Features {
    public static void main(String[] args) {
        Features.abc();
        Java8 obj = new Java8();
        obj.show();
        obj.config();
    }
}
