package Lab09;

/**
 * This is class contains methods to compute area of different shapes.
 * @author
 */
public class Area {


	/**
	 * This method computes the area of a circle
	 * @param r
	 * @return the value of the area of circle
	 */
	public  double circleArea (double r){

		return Math.PI * r * r;
	}

	/**
	 * This method computes the area of a triangle
	 * @param b, h
	 * @return the value of the area of triangle
	 */
	public double triangleArea (double b, double h) {

		return (0.5)*(b*h);
	}


	/**
	 * This method computes the area of a square
	 * @param l
	 * @return the value of the area of square
	 */
	public double squareArea (double a){

		return a*a;
	}

	/**
	 * This method computes the area of a rectangle
	 * @param l, w
	 * @return the value of the area of rectangle
	 */
	public double rectangleArea (double w, double l){

		return w*l;
	}


}
