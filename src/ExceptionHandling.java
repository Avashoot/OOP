public class ExceptionHandling {

    public static void main(String[] args) {
        //Normal statement
        int num1 = 10;
        int num2 = 0;
        int result = 0;

        //critical Statement
        try
        {
            //here we found an exception at 13 so line after 13 get skipped, so we cannot get next line of println here comes the concept of multiple catch
            result = num1 / num2;
            System.out.println("In try block");
        }catch (Exception e){
            System.out.println("Somthing went wrong" + e);
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}
