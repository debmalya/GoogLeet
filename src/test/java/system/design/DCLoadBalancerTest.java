package system.design;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DCLoadBalancerTest {
	
	DCLoadBalancer dcLoadBalancer;
	
	@BeforeEach
	void setUp() {
		dcLoadBalancer = new DCLoadBalancer();
	}

	@Test
	void testDCLoadBalancer() {
		assertNotNull(dcLoadBalancer);
	}

	@Test
	void testAddMachine() {
		dcLoadBalancer.addMachine(1, 1);
	}

	@Test
	void testRemoveMachine() {
//		fail("Not yet implemented");
	}

	@Test
	void testAddApplication() {
//		fail("Not yet implemented");
	}

	@Test
	void testStopApplication() {
//		fail("Not yet implemented");
	}

	@Test
	void testGetApplications() {
//		fail("Not yet implemented");
	}

}
