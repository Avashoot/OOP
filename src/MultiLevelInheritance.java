class Demo1{
    void display(){
        System.out.println("Display writtern in demo1 class");
    }
}

class Demo2 extends Demo1{

}

class Demo3 extends Demo2{

}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Demo3 d = new Demo3();
        d.display();
    }
}
