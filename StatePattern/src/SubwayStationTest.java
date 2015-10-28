import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SubwayStationTest {

	SubwayStation s;
	@Before
	public void setUp() throws Exception {
		s = new SubwayStation();
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}

	@Test
	public void testPass() {
		s.insertCoin();
		s.pass();
		assertEquals(s.getState(), s.lockedState);
	}
	
	@Test
	public void testInsertCoin() {
		s.insertCoin();
		assertEquals(s.getState(), s.unlockedState);
	}

}
