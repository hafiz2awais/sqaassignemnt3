import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import junit.framework.Assert;

public class ConverterTests {

	@Test
	public void DegreeHappyTest() {
		//Happy Path
		double degree = 90;
		double expected = 1.5707963267948966;
		double actual = new ConverterClass().DegreeToRadian(degree);
		Assert.assertEquals(expected, actual, 0.0000001);
		
	}
	@Test
	public void DegreeBoundaryTest() {
		//Happy Path
		int degree = new Random().nextInt(360); // we limit the value to degree value of 360
		double expected = Math.toRadians(degree);
		double actual = new ConverterClass().DegreeToRadian(degree);
		Assert.assertEquals(expected, actual, 0.0000001);
		
	}

}
