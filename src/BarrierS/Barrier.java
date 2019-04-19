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

	public synchronized void b_wait() throws InterruptedException {
		do {
			count += 1;
			System.out.println(count);
			barrier.acquire();
		} while (count != limit);
		barrier.release(limit);

		// if (count == limit) {
		// for (int i = 0; i < limit + 1; i++) {
		// barrier.release();
		// }
		// } else {
		// barrier.acquire();
		// count += 1;
		// }

	}
}
