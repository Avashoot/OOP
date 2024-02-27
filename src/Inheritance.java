class Human{//super class / base class / parent class
    private String name;
    int age;

    Human(){
        System.out.println("Constructor of human class");
    }
    void sleep(){
        age =18;
        System.out.println("Human need good sleep");
        System.out.println(age);
    }

}

class Student3 extends Human{ //child class / sub class / derived class
    void display(){
        System.out.println("the Age is : "+age);
//        System.out.println("the name is : "+name); private members will not participate in inheritance

    }

}

public class Inheritance {
    public static void main(String[] args) {
        Student3 st = new Student3();
        st.sleep();
        st.display();
    }
}
