package ExceptionHandling;

public class Exception_Handling {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 0;
//        int div = a/b;
//        System.out.println("Division:"+div);
        try {
            int a = 10;
            int b = 0;
            int div = a/b;
            System.out.println("Division:"+div);
        // try block throws the exception


        }
        catch(ArithmeticException e){
            System.out.println("My error is :"+e);
            // to solving and handling the error or debugging the exception
        }
//        finally {
//                    // always executing
//            System.out.println("my error is solved....:");
//       }
    }
}
