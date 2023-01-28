package system.design.rateLimiter;

import java.util.LinkedList;
import java.util.Queue;

public class RateLimiter {
	Queue<Integer> requestQueue;
	int noOfRequests;
	int timeWindow;

	public RateLimiter(int n, int t) {
		requestQueue = new LinkedList<Integer>();
		noOfRequests = n;
		timeWindow = t;

	}

	public boolean shouldAllow(int timestamp) {
		boolean ableToHandle = true;
		if (requestQueue.isEmpty()) {
			requestQueue.add(timestamp);
		} else {
			while (!requestQueue.isEmpty() && timestamp - requestQueue.peek()> timeWindow) {
				requestQueue.poll();
			}
			if (requestQueue.size() < noOfRequests) {
				ableToHandle = requestQueue.offer(timestamp);
			}else {
				ableToHandle = false;
			}
		}
		return ableToHandle;
	}

}
