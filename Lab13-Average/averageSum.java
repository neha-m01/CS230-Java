package Lab13;
import java.util.ArrayList;
import java.util.List;

public class averageSum<T> {
	
	public static <T extends Number> Pair<T,T> averageSum(T[] inputArray) {

		    T nums = inputArray[0];

		    Double average = 0.0;
		    Double sum = 0.0;

		    for (int i = 0; i < inputArray.length; i++) {
		      sum += inputArray[i].doubleValue(); 
		      average = sum/inputArray.length;

		    }
		  return new Pair<T,T> ((T) average,(T) sum); 
		  
	}
		

		public static void main(String[] args) {
			Integer[] intArray = {1,2,3,3,2,1};
			Double[] floatArray = {1.2,2.2,3.1428};
			
			System.out.println(averageSum(intArray).toString1());
			averageSum(intArray);
			System.out.println();
			System.out.println(averageSum(floatArray).toString1());
			averageSum(floatArray);
			System.out.println();
		}
		
		
}
