class Animal{
    void sleep(){
        System.out.println("Animal needs sleep");
    }

    public void eat(){
        System.out.println("Animal Eats Everyday");
    }
}

class Tiger extends Animal{
    public void eat(){
        System.out.println("Tiger Hunts And then Eat");
    }

}

public class SingleLevelInheritnce {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.sleep();
    }
}
