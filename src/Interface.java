interface A{
    int num  =6;
    //NOT REQUIRED TO WRITR PUBLIC
    void show();
}

interface X{
    void abc();
}

class B implements A,X{
    public void show(){
        System.out.println("In show");
    }
    //you have to write all the methods in the both the interface in the implementing class
    // otherwise it shows an error
    public void abc(){
        System.out.println("in abc");
    }
}

public class Interface {
    public static void main(String[] args) {
        System.out.println(A.num);
//        A obj = new B();// we can refer an object of B using A
//        obj.show();
//        obj.abc(); you cannot use it because A don't know about method abc();
        //you have to change object reference of B()

        B obj = new B();
        obj.show();
        obj.abc();

    }
}
