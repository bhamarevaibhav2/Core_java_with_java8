package solid;


//Clients should not be forced to depend on interfaces they do not use. 
//This principle encourages the creation of smaller, more specific interfaces rather than a large, general-purpose interface. 
//This leads to a more modular and flexible design.

//The SOLID principles provide a robust framework for designing software that is easy to maintain, extend, and understand. 

interface printer{
	void print();
}

interface Scanner{
	void scan();
}

// Clients should not be forced to depend on interfaces they do not use. 
//This principle advocates for creating smaller, more specific interfaces.
public class InterfaceSegregation {
	
	
}

class MultiFunctionPrinter implements printer, Scanner {
    public void print() {
        // Print logic
    }

    public void scan() {
        // Scan logic
    }
}

class SimplePrinter implements printer {
    public void print() {
        // Print logic
    }
}