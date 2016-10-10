package CISC181.Q3;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class testTriangle extends TestCase {

	public class TestTriangle {
		@BeforeClass
		public void setUpBeforeClass()throws Exception{
		}
		
		@AfterClass
		public void tearDownAfterClass()throws Exception{
		}
		
		@Before 
		public void setUp()throws Exception{
		}
		
		@After
		public void tearDown()throws Exception{
		}
		
		@Test
		public void testTriangle(){
			Triangle Triangle=new Triangle(3,4,5);
			assertEquals(12,Triangle.getPerimeter());
			assertEquals(6,Triangle.getArea());
		}
	}

}
