package BarrierS;

import java.util.concurrent.Semaphore;

public class Barrier {

	// add missing variables
	private int limit;
	private final Semaphore semaphore;

	Barrier(int limit) {
		this.semaphore = new Semaphore(limit); // Create Semaphore and set limit
	}

	public void b_wait() throws InterruptedException {
		semaphore.acquire();
	}

}
