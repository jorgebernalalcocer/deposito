import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DepositoCombustibleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDepositoCombustible() {
		
		fail("Not yet implemented");
	}

	@Test
	public void testGetDepositoNivel() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetDepositoMax() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaVacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(50.0,50.0);
		double nivel = tank.getDepositoNivel();
		assertTrue(nivel==50.0);
	}

	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
