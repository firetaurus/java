import static org.junit.Assert.*;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void whenConvertingMPHtoKMPH_thenSuccessFullyConverted() {
		Movable bugattiVeyron = new BugattiVeyron();
		MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);
		
		assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
	}

}
