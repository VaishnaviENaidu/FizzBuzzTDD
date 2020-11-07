import org.junit.Assert;
	import org.junit.Test;

public class FizzBuzzTest {
	
		@Test
		public void fizzbuzznormal() {
			FizzBuzzConverter fizzbuzz=new FizzBuzzConverter();
			Assert.assertEquals("1", fizzbuzz.convert(1));
}
}
