package daily;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JobSchedulingMaxProfitTest {

	@Test
	void testJobScheduling() {
		int[] startTime = new int[] { 1, 2, 3, 3 };
		int[] endTime = new int[] { 3, 4, 5, 6 };
		int[] profit = new int[] { 50, 10, 40, 70 };

		JobSchedulingMaxProfit jobSchedulingMaxProfit = new JobSchedulingMaxProfit();
		jobSchedulingMaxProfit.jobScheduling(startTime, endTime, profit);
	}

}
