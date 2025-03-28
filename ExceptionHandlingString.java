package ExceptionHandling;

public class ExceptionHandlingString {
    public static void main(String[] args) {
////        StringOutofBoundsException --3
//        String name = "Raghav";
//        System.out.println("My name :"+name.charAt(10));


        // nullPointetException
//         String a = null;
//        System.out.println("My name:"+a.length());


//        try {
//            String a = null;
//            System.out.println("My name:"+a.length());
//        }catch (NullPointerException e){
//            System.out.println("My String:"+e);
//        }


        try {
//            StringOutofBoundsException --3
        String name = "Raghav";
        System.out.println("My name :"+name.charAt(10));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("My String:"+e);
        }
    }
}
