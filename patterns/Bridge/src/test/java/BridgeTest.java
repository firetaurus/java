import static org.junit.Assert.*;

import org.junit.Test;

public class BridgeTest {

	@Test
	public void whenBridgePatternInvoked_thenConfigSuccess() {
		//a square with blue color
		
		Shape square = new Square(new Blue());
		
		assertEquals(square.draw(), "Square drawn. Color is Blue");
	}

}
