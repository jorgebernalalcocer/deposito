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
		DepositoCombustible tank = new DepositoCombustible(50.0,0.0);
double nivel = tank.getDepositoNivel();
assertTrue(nivel==0.0);
	}

	@Test
	public void testEstaLleno() {
		DepositoCombustible tank = new DepositoCombustible(50.0,50.0);
		double nivel = tank.getDepositoNivel();
		assertTrue(nivel==50.0);
	}


	@Test
	public void testFill() {
		DepositoCombustible tank = new DepositoCombustible(50.0,20.0);
		tank.fill(20.0);
		
		assertTrue(40.0==tank.getDepositoNivel());
		assertFalse(30.0==tank.getDepositoNivel());
	}

	@Test
	public void testConsumir() {
		fail("Not yet implemented");
	}

}
