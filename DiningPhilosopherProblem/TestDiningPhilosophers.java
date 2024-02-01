package DiningPhilosopherProblem;

import com.prowings.bookmyseatapp.staticsync.Theater;

/**
 * refer this site for notes : https://www.baledung.com/java-dining-philosophers
 */
public class TestDiningPhilosophers {
	
	public static void main(String[] args) {
		
		Philosopher[] philosophers = new Philosopher[5];
		Object[] forks = new Object[philosophers.length];
		
		for(int i=0; i<forks.length; i++) {
			forks[i] = new Object();
		}
	for(int i =0; i<philosophers.length; i++) {
		
		Object leftFork = forks[i];
		Object rightFork = forks[(i + 1) % forks.length];
		
//		philosophers[i] = new Philosopher(leftFork, rightFork); //if all philosophers picks left fork then circular wai condtion will occur
		
		//To break circular wait, we will ask all philosophers to pick left fork, but to last philosopher to pick right fork first - this will break circular wait and deadlock canlock can be avoided
		
		if (i == philosophers.length -1) {
			philosophers[i] = new Philosopher(rightFork, leftFork);
		} else {
			philosophers[i] = new Philosopher(leftFork, rightFork);
		}
		
		Thread t = new Thread(philosophers[i],"Philosopher " + (i + 1));
		t.start();
		
		}
	}
}
	
	

