
public class Test {
	public static void main(String[] args) {

		String string = "Afghanistan (+93)";

		//String[] st = string.split("+");
		
	//	String  rightside = string.replace("+", " +"); 
		
		int plus = string.lastIndexOf("+");
		int closeBrac = string.lastIndexOf(")");
	System.out.println(plus +" "+closeBrac);
		
	String mainString  = string.substring(13+1,16); 
	
	
		System.out.println(mainString);
	}
}
