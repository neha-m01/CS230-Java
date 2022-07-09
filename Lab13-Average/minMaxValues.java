package Lab13;

import java.util.ArrayList;



	public class minMaxValues<T> {

		

		public static <T> Pair<T,T> minMax(T[] inputArray) {

		    T large = inputArray[0];

		    for (int i = 0; i < inputArray.length; i++){

		        if(inputArray[i].toString().compareTo(large.toString()) > 0)

		            large = inputArray[i];
		    }
		    T small = inputArray[0];

		    for(int i=0; i < inputArray.length; i++){

		        if(inputArray[i].toString().compareTo(small.toString()) < 0)

		            small = inputArray[i];

		}
		    
		    return new Pair<T,T> (small,large); 
		}


		public static void main(String[] args) {
			
			Integer[] intArray = {1,2,3,3,2,1};
			Double[] floatArray = {1.2,2.2,3.1428};
			
			System.out.println(minMax(intArray).toString());
			minMax(intArray);
			System.out.println();
			System.out.println(minMax(floatArray).toString());
			minMax(floatArray);
			System.out.println();
			
		}

		}
	
