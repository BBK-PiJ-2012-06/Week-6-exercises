import org.junit.*;
import static org.junit.Assert.*;
public class ListTest {
	@Test
	public void testsBasicInts() {
		List<Integer> l = new GenericList<Integer>();
		Integer first = 6;
		l.add(first);
		assertEquals(first, l.getElement(0));	
		
		Integer second = 2;
		Integer third = 3;
		l.add(second);
		l.add(third);
		assertEquals(second, l.getElement(1));
		assertEquals(third, l.getElement(2));
		assertEquals(first, l.getFirst());
		assertEquals(third, l.getLast());
		
		assertEquals(3, l.size());
		l.delete(second);
		assertEquals(2, l.size());
	}
	@Test
	public void testsBasicStrings() {
		List<String> l = new GenericList<String>();
		String first = "one";
		l.add(first);
		assertEquals(first, l.getElement(0));	
		
		String second = "two";
		String third = "third";
		l.add(second);
		l.add(third);
		assertEquals(second, l.getElement(1));
		assertEquals(third, l.getElement(2));
		assertEquals(first, l.getFirst());
		assertEquals(third, l.getLast());
		
		assertEquals(3, l.size());
		l.delete(second);
		assertEquals(2, l.size());
	}
	@Test
	public void testsBorders() {
		
	}
}