package exceptionHandling;

class ThrowsExecp {

    //we can handle the exception in two ways:
    //By using try catch
    //By using the throws keyword

    //throws is a keyword in Java that is used in the signature of a method to indicate that this method might throw one
    // of the listed type exceptions.
    // The caller to these methods has to handle the exception using a try-catch block.

    //throws keyword is required only for checked exceptions and usage of the throws keyword for unchecked exceptions is meaningless.
    //throws keyword is required only to convince the compiler and usage of the throws keyword does not prevent abnormal
    // termination of the program.
    //With the help of the throws keyword, we can provide information to the caller of the method about the exception.

    static void fun() throws IllegalAccessException
    {
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String args[])
    {
        try {
            fun();
        }
        catch (IllegalAccessException e) {
            System.out.println("caught in main.");
        }
    }

    //using the throws keyword we handled the InterruptedException and we will get the output as Hello Geeks
//    public static void main(String[] args)
//            throws InterruptedException
//    {
//        Thread.sleep(10000);
//        System.out.println("Hello Geeks");
//    }
}
