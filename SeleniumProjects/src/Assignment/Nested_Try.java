package Assignment;

public class Nested_Try {

	public static void main(String[] args) {
		try {
			int[] arr = {1, 2, 3};
			System.out.println(arr[1]); 
			try {
				String str = null;
				System.out.println(str.length()); 
			} catch (NullPointerException e) {
				System.out.println("Caught NullPointerException: " + e.getMessage());
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Caught Exception: " + e.getMessage());

	}

}}
