import org.junit.Test;

public class FinalFizzBuzzTest {

	
	@Test
	public void finalTestOutput(){
	FizzBuzzConverter fizzbuzz=new FizzBuzzConverter();
     for(int i = 1; i<=100;i++) {
    	 System.out.println(fizzbuzz.convert(i));
      }
	
   }

}
