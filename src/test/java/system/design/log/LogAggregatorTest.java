package system.design.log;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;

class LogAggregatorTest {

	@Test
	void testGetLogsFromMachine() {
		LogAggregator logAggregator = populateLogAggregator();

		List<Integer> messagesForMachine2 = logAggregator.getLogsFromMachine(2);
		assertAll(() -> assertEquals(4, messagesForMachine2.size()),
				() -> assertEquals(23222, (int) messagesForMachine2.get(0)),
				() -> assertEquals(23122, (int) messagesForMachine2.get(1)),
				() -> assertEquals(23522, (int) messagesForMachine2.get(2)),
				() -> assertEquals(22982, (int) messagesForMachine2.get(3)));

	}

	private LogAggregator populateLogAggregator() {
		LogAggregator logAggregator = new LogAggregator(3, 3);
		logAggregator.pushLog(2322, 1, 1, "Machine 1 Service 1 Log 1");
		logAggregator.pushLog(2312, 1, 1, "Machine 1 Service 1 Log 2");
		logAggregator.pushLog(2352, 1, 1, "Machine 1 Service 1 Log 3");
		logAggregator.pushLog(2298, 1, 1, "Machine 1 Service 1 Log 4");
		logAggregator.pushLog(23221, 1, 2, "Machine 1 Service 2 Log 1");
		logAggregator.pushLog(23121, 1, 2, "Machine 1 Service 2 Log 2");
		logAggregator.pushLog(23222, 2, 2, "Machine 2 Service 2 Log 1");
		logAggregator.pushLog(23122, 2, 2, "Machine 2 Service 2 Log 2");
		logAggregator.pushLog(23521, 1, 2, "Machine 1 Service 2 Log 3");
		logAggregator.pushLog(22981, 1, 2, "Machine 1 Service 2 Log 4");
		logAggregator.pushLog(23522, 2, 2, "Machine 2 Service 2 Log 3");
		logAggregator.pushLog(22982, 2, 2, "Machine 2 Service 2 Log 4");
		return logAggregator;
	}

	@Test
	void testGetLogsOfService() {
		LogAggregator logAggregator = populateLogAggregator();
		List<Integer> messagesForService2 = logAggregator.getLogsOfService(2);
		assertAll(() -> assertEquals(8, messagesForService2.size()),
				() -> assertEquals(23221, (int) messagesForService2.get(0)),
				() -> assertEquals(23121, (int) messagesForService2.get(1)),
				() -> assertEquals(23222, (int) messagesForService2.get(2)),
				() -> assertEquals(23122, (int) messagesForService2.get(3)),
				() -> assertEquals(23521, (int) messagesForService2.get(4)),
				() -> assertEquals(22981, (int) messagesForService2.get(5)),
				() -> assertEquals(23522, (int) messagesForService2.get(6)),
				() -> assertEquals(22982, (int) messagesForService2.get(7)));
	}

	@Test
	void testSearch() {
		LogAggregator logAggregator = populateLogAggregator();
		List<String> actual = logAggregator.search(1, "Log 1");
		assertAll(() -> assertEquals(1, actual.size()), () -> assertEquals("Machine 1 Service 1 Log 1", actual.get(0)));

		List<String> actual1 = logAggregator.search(2, "Log 3");
		assertAll(() -> assertEquals(2, actual1.size()),
				() -> assertEquals("Machine 1 Service 2 Log 3", actual1.get(0)),
				() -> assertEquals("Machine 2 Service 2 Log 3", actual1.get(1)));
	}

	@Test
	void test() {
		LogAggregator logAggregator = new LogAggregator(7, 2);
		logAggregator.pushLog(57007, 1, 0, "wsU");
		List<Integer> actual = logAggregator.getLogsFromMachine(4);
		assertAll(() -> assertTrue(actual.isEmpty()));
	}

	@Test
	void test1() {
		LogAggregator logAggregator = new LogAggregator(2, 10);
		List<String> actual = logAggregator.search(7, "v");
		assertAll(() -> assertTrue(actual.isEmpty()));
	}

	@Test
	void test2() {
		/*
		 * [ "pushLog","getLogsOfService"] [
		 * ,[32942, 10,1,"7WPbpjIP9EeM1iGx0wFhcBJ2"],[2]]
		 */
		LogAggregator logAggregator = new LogAggregator(18, 6);
		List<String> searchResult = logAggregator.search(1, "u");
		assertTrue(searchResult.isEmpty());
		searchResult = logAggregator.search(2, "mKL6");
		assertTrue(searchResult.isEmpty());
		List<Integer> serviceLog = logAggregator.getLogsOfService(2);
		assertTrue(serviceLog.isEmpty());
		searchResult = logAggregator.search(0, "0");
		assertTrue(searchResult.isEmpty());
		List<Integer> searchString = logAggregator.getLogsFromMachine(15);
		assertTrue(searchString.isEmpty());
		logAggregator.pushLog(86954, 5, 3, "PscNzrVdB7CS4wvegcV9");
		logAggregator.pushLog(31171, 16, 3, "2BQsZBu7XCLOThQ4OzkB");
		logAggregator.pushLog(64860, 17, 4, "Xo8dNKnxjWC50ZoUtl2S Dc2mcFIajjcX4E7i34AxH z803IN");
		logAggregator.pushLog(57052, 4, 1, "TJW2vT3SjzZoG9JB2 Kx6Qr2rJI01EnRtt6");
		searchString = logAggregator.getLogsOfService(0);
		assertTrue(searchResult.isEmpty());
		searchResult = logAggregator.search(5, "Q");
		assertTrue(searchResult.isEmpty());
		serviceLog = logAggregator.getLogsFromMachine(7);
		assertTrue(serviceLog.isEmpty());
		serviceLog = logAggregator.getLogsOfService(2);
		assertTrue(serviceLog.isEmpty());
		searchResult = logAggregator.search(1, "q");
		assertTrue(searchResult.isEmpty());
	}

}
