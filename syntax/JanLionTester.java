package syntax;

public class JanLionTester {

	public static void main (String[] args) {
		JanSyntaxLion a = new JanSyntaxLion ("Leo", 25);
		JanSyntaxLion b = new JanSyntaxLion ("King", 19);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
		System.out.println(a.AgeCalc());
		System.out.println(b.AgeCalc());
		
	}
}
