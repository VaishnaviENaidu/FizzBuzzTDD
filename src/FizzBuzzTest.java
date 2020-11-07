import org.junit.Assert;
import org.junit.Test;


public class FizzBuzzTest {
	
		@Test
		public void fizzbuzznormal() {
			FizzBuzzConverter fizzbuzz=new FizzBuzzConverter();
			Assert.assertEquals("1", fizzbuzz.convert(1));
			Assert.assertEquals("2", fizzbuzz.convert(2));
		
		}
		
		@Test
		public void multiplesofthree() {
			FizzBuzzConverter fizzbuzz=new FizzBuzzConverter();
		Assert.assertEquals("Fizz",fizzbuzz.convert(3));
		}
		
		
		
		
		
		
		
}
