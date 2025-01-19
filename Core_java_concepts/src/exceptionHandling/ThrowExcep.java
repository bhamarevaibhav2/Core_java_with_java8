package exceptionHandling;

class ThrowExcep {

    //The throw keyword in Java is used to explicitly throw an exception from a method or any block of code.
    // We can throw either checked or unchecked exception.
    // The throw keyword is mainly used to throw custom exceptions.

    //The flow of execution of the program stops immediately after the throw statement is executed and
    // the nearest enclosing try block is checked to see if it has a catch statement that matches the type of exception.
    // If it finds a match, controlled is transferred to that statement otherwise next enclosing try block is checked,and so on.
    // If no matching catch is found then the default exception handler will halt the program.

    static void fun()
    {
        try {
            throw new NullPointerException("demo");
            //Instance must be of type Throwable or a subclass of Throwable.
        }
        catch (NullPointerException e) {
            System.out.println("Caught inside fun().");
            throw e; // rethrowing the exception
        }
    }

    public static void main(String args[])
    {
        try {
            System.out.println("before fun");
            fun();
            System.out.println("after fun");
        }
        catch (NullPointerException e) {
            System.out.println( e+" : Caught in main.");
        }
    }
}
