package multithreading;

public class SharedResource {

	private boolean isResourceAvailable = false;

	public synchronized void useResource(String threadName) {
		while (!isResourceAvailable) {
			try {
				System.out.println(threadName + " is waiting for the resource.");
				wait(); // Releases the lock and waits for notification
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		System.out.println(threadName + " is using the resource.");
		isResourceAvailable = false;

		// Simulating some work with the resource
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println(threadName + " has released the resource.");
		isResourceAvailable = true;

		notifyAll(); // Notifying all waiting threads that the resource is available
	}
}
