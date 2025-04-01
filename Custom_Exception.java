package ExceptionHandling;
class RoshanException extends Exception{
    public RoshanException(String msg){ // constructor
        super(msg);

    }

}

public class Custom_Exception {
    public static void main(String[] args) {
        try{
//           throw new RoshanException("My message");
            checkNumber(1);

        }catch(RoshanException e){
            System.out.println("My Custom Error:" +e);

        }finally{
            System.out.println("My custom error is Created");
        }

    }

    public static void checkNumber(int number)throws RoshanException{
        if (number > 5){
            throw new RoshanException("Number is below 5");// else part is not required

        }

    }

    }

