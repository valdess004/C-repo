package ca.utoronto.utm.arraylist;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.*;


public class OddTest {

	@Test
	public void testOdds() {
		// Add test cases here

		ArrayList<Integer> actual;
		ArrayList<Integer> expected = new ArrayList<Integer>();
		
		actual = Odd.odds(-5);
		assertEquals("odds(-5) should be empty", expected, actual);  
		
		actual = Odd.odds(-2);
		assertEquals("odds(-2) should be empty", expected, actual);  

		actual = Odd.odds(-1);
		assertEquals("odds(-1) should be empty", expected, actual);  

		actual = Odd.odds(0);
		assertEquals("odds(0) should be empty", expected, actual);  

		actual = Odd.odds(2);
		expected.add(1);
		assertEquals("odds(2) smallest non-empty odd set", expected, actual);  

		actual = Odd.odds(3);
		assertEquals("odds(3) smallest non-empty odd set", expected, actual);  

		actual = Odd.odds(10);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(9);
		assertEquals("odds(10) more general n", expected, actual);  

		actual = Odd.odds(11);
		assertEquals("odds(11) more general n", expected, actual);  
			
	}
}