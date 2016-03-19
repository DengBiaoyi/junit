package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testTest{

	@Before
	public void init(){
		//TODO
	}
	
	@Test
	public void test0() {
		assertEquals(-1,test.testAngle(3, 2, 1));
	}
	
	@Test
	public void test1() {
		assertEquals(0,test.testAngle(1, 1, 1));
	}
	
	@Test
	public void test2() {
		assertEquals(1,test.testAngle(3, 4, 5));
	}
	
	@Test
	public void test3() {
		assertEquals(2,test.testAngle(2, 2, 3));
	}
		
}
