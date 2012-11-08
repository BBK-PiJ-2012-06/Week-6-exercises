import org.junit.*;
import static org.junit.Assert.*;
public class StackTest {
	@Test
	public void testsBasicInts() {
		Integer someNumber = new Integer(12);
		Stack<Integer> s = new MockStack<Integer>(someNumber);
		Integer first = 1;
		s.push(first);
		assertEquals(first, s.peek());	
		
		Integer second = 2;
		Integer third = 3;
		s.push(second);
		s.push(third);
		assertEquals(third, s.peek());
		assertEquals(third, s.pop());
		assertEquals(second, s.pop());
		assertEquals(first, s.pop());
		
		assertEquals(true, s.isEmpty());
	}
	@Test
	public void testsBasicDoubles() {
		Double someNumber = new Double(1.277);
		Stack<Double> s = new MockStack<Double>(someNumber);
		Double first = 0.1;
		s.push(first);
		assertEquals(first, s.peek());	
		
		Double second = 0.2;
		Double third = 0.3;
		s.push(second);
		s.push(third);
		assertEquals(third, s.peek());
		assertEquals(third, s.pop());
		assertEquals(second, s.pop());
		assertEquals(first, s.pop());
		
		assertEquals(true, s.isEmpty());
	}
	@Test
	public void testsBorders() {
		
	}
}