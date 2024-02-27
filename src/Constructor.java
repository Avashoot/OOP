class Student1{
    private int age;
    private String name;


    Student1(String name, int age){
        this.name = name;
        this.age=age;
    }
    public int getAge() {
        return age;
    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
    public String getName() {
        return name;
    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public void show(){
//        System.out.println(name + " "+ age);
//    }
}

class Demo{
    private int a;
    private int b;

    public Demo(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Demo(){
        System.out.println("zero parametrized constructor included by programmer");

    }

    void display(){
        System.out.println(a);
        System.out.println(b);

    }
}
public class Constructor {
    public static void main(String[] args) {
//        Student1 s = new Student1("Ram",20 );
//        String names = s.getName();
//        System.out.println(names);

        Demo d = new Demo();
        d.display();
        Demo d1 = new Demo(10,20);
        d1.display();

    }
}
