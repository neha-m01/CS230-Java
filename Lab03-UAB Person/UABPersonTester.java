package Lab03;

public class UABPersonTester {
	public static void main(String[] args) {

		  UABPerson Hannah = new UABPerson("Hannah", "female",40, "hannah02");
		  UABPerson John = new UABPerson("John", "male", 5, "johnathan1");

		  System.out.println("Testing Palindrome method: " + Hannah.checkPalindrome());
		  System.out.println("Testing Palindrome method: " + John.checkPalindrome());
		  
		  System.out.println("Testing Years Until Retirement method: " + Hannah.yearsUntilRetirement());
		  System.out.println("Testing Years Until Retirement method: " + John.yearsUntilRetirement());
		  
		  System.out.println("Testing toString method: " + Hannah.toString());
		  System.out.println("Testing toString method: " + John.toString());

		}
	}

