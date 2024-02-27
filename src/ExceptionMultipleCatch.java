public class ExceptionMultipleCatch {
    public static void main(String[] args) {
        //Normal statement
        int num1 = 10;
        int num2 = 0;
        int result = 0;
        int[] arr = {2,3,4,5};
        String name = null;

        //critical Statement
        try
        {
            //here we found an exception at 13 so line after 13 get skipped, so we cannot get next line of println here comes the concept of multiple catch
//            result = num1 / num2;
            result = num1 / name.length();
            System.out.println(arr[5]);
            System.out.println("In try block");
        }catch (ArithmeticException e){
            System.out.println("cannot divide by zero" + e);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Your index is greater than the size of an array");
            System.out.println("The last element of an array is : "+ arr[arr.length -1]);
        }catch (NullPointerException e){
            System.out.println("The String value is null so we cannot use string length() method");
        }catch(Exception e){
            System.out.println("Something went wrong");
        }

        System.out.println(result);
        System.out.println("Bye");
    }
}
