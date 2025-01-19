package exceptionHandling;

import java.util.*;

public class ExceptionOne{

    //Exception is an event which occurs during programming execution that interrupt the normal flow of program

    public static void main(String[] args){ //we can throws exception instead of tryCatch

        List<Integer> num = new ArrayList<>();
        num.add(111);
        try{
            System.out.println(num.get(1));
            num.add(112);
            System.out.println(num.get(1));
        }
        catch(IndexOutOfBoundsException e){ //wrong exception catch
            e.printStackTrace();
            System.out.println("Array index out of bounds");
        }
        catch(Exception e){ // parent will handle all exceptions
            System.out.println(e);
            System.out.println("Parent");
            //System.exit(0);//in this situation finally block will not execute
        }
        finally{
            //mostly use for close resources or connections
            System.out.println("Finally block"); //execute in any situation exception occur or not
            //excluding system.exit(); statement
        }
        //throws and throw
    }
}
