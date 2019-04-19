package BarrierS;

import java.util.concurrent.Semaphore;

public class Barrier {

	private int limit;
	private static int count = 0;
	private final Semaphore barrier;

	Barrier(int limit) {
		this.barrier = new Semaphore(0); // Create Semaphore and set limit
		this.limit = limit; // Set limit
	}

	public void b_wait() throws InterruptedException {
		count += 1;
		if (count == limit) {
			synchronized (barrier) {
				barrier.notifyAll();
			}

		}
		synchronized (barrier) {
			barrier.wait();
			barrier.notify();
		}
	}
}
