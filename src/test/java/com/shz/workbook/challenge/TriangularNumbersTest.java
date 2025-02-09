/**
 * 
 */
package com.shz.workbook.challenge;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author shenazz
 *
 */
public class TriangularNumbersTest {

	@Test
	public void given_7_when_solution1_then_28() {

		//given
		int n = 7;

		//when
		int result = TriangularNumbers.solution1(n);

		//then
		assertEquals(28, result);
	}

	@Test
	public void given_7_when_solution2_then_28() {

		//given
		int n = 7;

		//when
		int result = TriangularNumbers.solution2(n);

		//then
		assertEquals(28, result);
	}

}
