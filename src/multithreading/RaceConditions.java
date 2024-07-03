package multithreading;

class RaceConditions {

	 int brickCount = 0;
	 int brickCount2 = 0;

	public synchronized void incrementBrickCount() {
		/*
		 * synchronized (this) { brickCount += 50; }
		 */
		
		brickCount2 += 50;
	}
	


}



