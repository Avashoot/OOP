//Inner class type : member, static and Anonymous
class Outer{

    public void show(){
        System.out.println("in show");
    }

    class Inner{ // member inner class
        public void display(){
            System.out.println("in Inner in Display");
        }

    }

    static class InnerStatic{ //static inner class
        public void disp(){
            System.out.println("In static in disp");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();
//        Inner obj1 = new Inner(); we got Error here because compiler didn't get the Inner Class
        Outer.Inner obj1 = obj.new Inner();
        obj1.display();

        Outer.InnerStatic obj2 = new Outer.InnerStatic();
        obj2.disp();
    }
}
