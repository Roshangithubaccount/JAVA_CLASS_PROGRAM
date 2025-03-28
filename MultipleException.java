package ExceptionHandling;

public class MultipleException {
    public static void main(String[] args) {
        try{
            // Arithmetic exception  -- 1
            int div = 10/0;

//            Arrey index put of bound Exception ---2

            int[]numbers = {1,2,3,4,5,6};
                    System.out.println("my arary :"+numbers[10]);


            String name = "Roshan";
            System.out.println("My name is:"+name.charAt(15));

            String a = null;
            System.out.println("MY name is :"+a.length());

        }catch(ArithmeticException e){
            System.out.println("THis is my first exception:"+e);

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("THis is my second exception:"+e);

        }catch(StringIndexOutOfBoundsException e){
            System.out.println("THis is my Third exception:"+e);

        }catch(NullPointerException e){
            System.out.println("THis is my Fourth exception:"+e);

        }finally {


            System.out.println("My four error solved");

        }
    }
}
