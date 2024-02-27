class Animal1{
    void sleep(){
        System.out.println("Animal needs sleep");
    }
}

class Monkey extends Animal1{

}

class Lion extends Animal1{

}

class Deer extends Animal1{

}

public class HerarchicalInheritance {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.sleep();
        Lion l = new Lion();
        l.sleep();
    }
}
