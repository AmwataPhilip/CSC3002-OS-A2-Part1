package BarrierS;

import java.util.concurrent.Semaphore;

public class Barrier {

	private int limit;
	private static int count = 1;
	private final Semaphore barrier;

	Barrier(int limit) {
		this.barrier = new Semaphore(0); // Create Semaphore and set limit
		this.limit = limit; // Set limit
	}

	public synchronized void b_wait() throws InterruptedException {
		Semaphore sync = new Semaphore(1);
		while (count < limit) {
			synchronized (sync) {
				count += 1;
				System.out.println(count);
			}
			barrier.acquire();
		}
		synchronized (barrier) {
			barrier.notifyAll();
		}

		// if (count == limit - 1) {
		// barrier.release(limit * 2);
		// } else {
		// count += 1;
		// System.out.println(barrier.availablePermits());
		// barrier.acquire();
		// }
	}
}
