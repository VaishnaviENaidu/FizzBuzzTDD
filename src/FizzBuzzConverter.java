
public class FizzBuzzConverter {

	public String convert(int num) {
		// TODO Auto-generated method stub
		
		if(num%5==0) {
			return "Buzz";
		}
		
		if(num%3==0) {
			return "Fizz";
		}
		
		
		return String.valueOf(num);
	}

}
