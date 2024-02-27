class Duck{
    void a() throws Exception{
        // method a handling an exception
//        try {
//            b();
//        }catch (Exception e){
//            System.out.println("Error... " + e.getMessage());
//        }

        // method a does not handle an exception
        b();
    }

    void b() throws Exception{
        int n1 = 10;
        int n2 = 0;
//        try{
//            int result = n1/n2;
//            System.out.println(result);
//        }catch (Exception e){
//            System.out.println("Error........." + e.getMessage());
//        }


        //Don't want to handle the exception
        int result = n1/n2;
        System.out.println(result);
    }
}
public class ExceptionHandlingVsDuccking {
    public static void main(String[] args) {
        Duck obj = new Duck();
        // main method handling an exception
        try{
            obj.a();
        }catch(Exception e){
            System.out.println("Error "+ e.getMessage());
        }
    }
}
