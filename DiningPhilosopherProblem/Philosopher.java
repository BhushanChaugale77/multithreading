package DiningPhilosopherProblem;

public class Philosopher implements Runnable {
	
	private final Object leftFork;
	private final Object righttFork;
	
	public Philosopher (Object left, Object right){
		this.leftFork = left;
		this.righttFork = right;
	}
	
 

	private void doaction(String action) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+ " " + action);
		Thread.sleep(((int)(Math.random() * 10)));
	}
	
	@Override
	public void run() {
 
		try {
			while(true) {
				doaction(System.nanoTime() + ": Thinking"); //thinking
				synchronized (leftFork) {
						doaction(System.nanoTime() + ": Picked up left fork");
						doaction(System.nanoTime() + ": Put down right fork");
					}
				doaction(System.nanoTime() + ": Put down left fork.Returning to thinking");
			}
	
		}
		catch (Exception e) {
 
			Thread.currentThread().interrupt();
		}
	
	}
	

	
	
}
