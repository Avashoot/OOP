class Student2{
    private String name;
    private int age;

    public Student2(){
        this("Vedant",23);
        System.out.println("Default constructor get called");
        name = "Ratan";
        age = 14;
    }

    public Student2(String name){
        this();
        this.name = name;
        age =16;
    }

    public Student2(String name , int age){
        this.name=name;
        this.age = age;
    }

    public void display(){
        System.out.println(name);
        System.out.println(age);
    }
}
public class constructorOverloading {
    public static void main(String[] args) {
        Student2 st1 = new Student2();
        st1.display();

        Student2 st2 = new Student2("Ritesh");
        st2.display();

//        Student2 st3 = new Student2("ramesh", 10);
//        st3.display();
    }
}
