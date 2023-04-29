package thread;

public class ThreadDemo extends Thread{
	
	public ThreadDemo() {
		// TODO Auto-generated constructor stub		
	}
	
	@Override
	public void run() {
		for(int i = 0; i<=5;i++) {
			
			System.out.println("Thread Running");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadDemo t = new ThreadDemo();
//		t.start();
//		t.run();
		System.out.println("Main running");
		
		
	}

}
