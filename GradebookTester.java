import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GradebookTester {

	private GradeBook book1;
	private GradeBook book2;
	
	@Before
	public void setup ()
	{
		book1 = new GradeBook(3);
		book1.addScore(100);
		book1.addScore(90.5);
		book1.addScore(80);
		
		book2 = new GradeBook(3);
		book2.addScore(88.8);
		book2.addScore(75.5);
		book2.addScore(99);
	}
	
	@After
	public void teardown ()
	{
		book1= null;
		book2= null;
	}
	
	@Test
	public void testAddScore()
	{
		assertTrue(book1.toString().equals("100.0 90.5 80.0 "));
		assertTrue(book2.toString().equals("88.8 75.5 99.0 "));
		
		assertEquals(book1.getScoreSize(),3);
		assertEquals(book2.getScoreSize(),3);
	}
	
	@Test
	public void testSum()
	{
		assertEquals(book1.sum(),270.5,.001);
		assertEquals(book2.sum(),263.3,.001);
	}
	
	@Test
	public void testMin()
	{
		assertTrue(book1.minimum()==80);
		assertTrue(book2.minimum()==75.5);
	}
	
	@Test
	public void testFinalScore()
	{
		assertTrue(book1.finalScore()==190.5);
		assertTrue(book2.finalScore()==187.8);
	}
	
}
