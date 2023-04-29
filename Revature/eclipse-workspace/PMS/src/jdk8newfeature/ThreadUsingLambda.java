package jdk8newfeature;

public class ThreadUsingLambda {

	public static void main(String[] args) {
	
				
			Thread.currentThread().setName("Main thread");
				
			System.out.println("thread in main class" + Thread.currentThread().getName());
				
			Runnable r1 = () -> {
				
				System.out.println("thread using lambda expression" + Thread.currentThread().getName());
			};
			
			Thread thread = new Thread(r1);
			thread.start();
			}
	
}
