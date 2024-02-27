import java.util.Scanner;

public class ExceptionFinally {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
        int n =0;
//        try{
//            n = sc.nextInt();
//        }catch(InputMismatchException e){ //if there is finally block then there is not a compulsory of the catch block
//            System.out.println("Please enter an Integer Number");
//        }finally {
//            sc.close();
//        }

        //try with resource, it used for closing the resource after execution of try block
        try(Scanner sc = new Scanner(System.in)){
            n = sc.nextInt();
        }
        System.out.println(n);
    }
}
