class Student{
    private int age;
    private String name;

//    public void setAge(int age){
//        this.age /*This is instance variable*/ = age;/*This is local variable*/
//        //but compiler thinks both are lock variable
//        //so value could not able to assign to the varibale
//        //this is known as shadowing problem
////
//    }
//
//    public int getAge(){
//        return age;
//    }
//
//    public void setName(String name){
//        this.name = name;
//    }
//
//    public String getName(){
//        return name;
//    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println(name + " "+ age);
    }
}
public class Encapsulation {
    public static void main(String[] args){
        Student st = new Student();
        Student std = new Student();
        //private variable could not accessable
//        st.age =20;
//        st.name = "Avadhoot";
        st.setAge(20);
        std.setAge(22);
        st.setName("ram");
        std.setName("Avadhoot");

//        st.show();
//        std.show();
        int std1Age = st.getAge();
        System.out.println(std1Age);

        String std1Name = st.getName();
        System.out.println(std1Name);
    }
}
