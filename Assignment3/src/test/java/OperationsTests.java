import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

import junit.framework.Assert;

public class OperationsTests {

	@Test
	public void costest() {
		//Happy Path
		OperationsClass obj = new OperationsClass();
		double value = 1.5707963267948966;
		double expected = 0;
		double actual = obj.cosineX(value);
		Assert.assertEquals(expected, actual, 0.0001);
	}
	
	@Test
	public void sintest() {
		//Boundary Value Test
		OperationsClass obj = new OperationsClass();
		double value = new Random().nextInt(360);
		double radian = Math.toRadians(value);
		double expected = Math.sin(radian);
		double actual = obj.sinX(radian);
		Assert.assertEquals(expected, actual, 0.0001);
	}

}
