class Demo4{
    int a, b;

    public Demo4(){
        System.out.println("Parent Class constructor");
    }

    public Demo4(int x, int y){
        System.out.println("Parameterized parent class constructor");
        a=x;
        b=y;
    }
}

class Demo5 extends Demo4{
    int m, n;

    public Demo5(){
        this(10,20);
//        super(10,20);
        System.out.println("child Class constructor");
    }

    public Demo5(int x, int y){

        System.out.println("Parameterized child class constructor");
        m = x;
        n = y;
    }
}

public class ConstructorCaseInInheritance {
    public static void main(String[] args) {
        Demo5 d = new Demo5();
        System.out.println(d.m);
        System.out.println(d.n);
    //    Demo5 d1 = new Demo5(10,12);

    }
}
