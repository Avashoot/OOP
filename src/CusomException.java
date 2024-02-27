class MyException extends Exception
{
    public MyException(){

    }
    public MyException(String msg){
        super(msg);
    }
}

public class CusomException {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = -1;
        try{
            if(n2 <0 || n1 <0){
//                Exception e = new ArithmeticException("Negative Number");
                Exception e = new MyException("negative number");
                throw e;
            }
            else {
                int result = n1 / n2;
                System.out.println(result);
            }
        }catch (Exception e ){
            System.out.println("Enter a valid number  " + e);
        }


    }
}
