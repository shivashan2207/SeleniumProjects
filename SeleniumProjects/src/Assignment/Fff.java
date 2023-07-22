package Assignment;

public class Fff {

	public static void main(String[] args) {
		 // final keyword example
	    final int x = 10; // x is a final variable, so its value cannot be changed
	    System.out.println("The value of x is: " + x);
	    // x = 20; // This will result in a compilation error since x is final
	    
	    // finally keyword example
	    try {
	      int y = 10 / 0; // This will result in an ArithmeticException
	    } catch (ArithmeticException e) {
	      System.out.println("An exception occurred: " + e.getMessage());
	    } finally {
	      System.out.println("This block is always executed, whether or not an exception occurs.");
	    }
	    
	 // finalize method example
	    Fff example = new Fff(); // Create a new object of the Example class
	    example = null; // Set the object reference to null, so the object becomes eligible for garbage collection
	    System.gc(); // Call the garbage collector explicitly to clean up the unused object
	  }
	  
	  @Override
	  protected void finalize() throws Throwable {
	    System.out.println("The Example object has been garbage collected.");
	}

	}


