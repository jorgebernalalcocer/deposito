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


		DepositoCombustible tank = new DepositoCombustible(40.0,0.0);
		double devuelto=tank.getDepositoNivel();
		assertEquals(0.0,devuelto);
    }


    @Test
	public void testGetDepositoMax() {
		DepositoCombustible tank = new DepositoCombustible(50.0,0.0);
		double devuelto=tank.getDepositoMax();
		assertEquals(50.0,devuelto);
	}

	@Test
	public void testEstaVacio() {
		fail("Not yet implemented");
	}

	@Test
	public void testEstaLleno() {
		fail("Not yet implemented");
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
