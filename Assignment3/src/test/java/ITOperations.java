import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class ITOperations {

	@Test
	public void cosDegree() {
		OperationsClass obj1 = new OperationsClass();
		ConverterClass obj2 = new ConverterClass();
		
		double degree = 90;
		double expected = 0;
		
		double rads = obj2.DegreeToRadian(degree);
		double actual = obj1.cosineX(rads);
		
		Assert.assertEquals(expected, actual, 0.000001);
	}
	@Test
	public void sinDegree() {
		OperationsClass obj1 = new OperationsClass();
		ConverterClass obj2 = new ConverterClass();
		
		double degree = 90;
		double expected = 1;
		
		double rads = obj2.DegreeToRadian(degree);
		double actual = obj1.sinX(rads);
		
		Assert.assertEquals(expected, actual, 0.000001);
	}
	

}
