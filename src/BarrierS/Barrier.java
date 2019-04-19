package BarrierS;

import java.util.concurrent.Semaphore;

public class Barrier {

	private int limit;
	private final Semaphore semaphore;

	Barrier(int limit) {
		this.semaphore = new Semaphore(limit); // Create Semaphore and set limit
		this.limit = limit; // Set limit as input limit
	}

	public int getLimit() {
		return limit;
	}

	public void b_wait() throws InterruptedException {
		int counter = 0;
		while (counter < this.limit) {
			semaphore.acquire();
		}

	}

}
