package lambaExpression;

class ThreadDemo1 extends Thread{
	
	@Override
	public void run() {
			System.out.println("Running extends Thread class..."); //running state
			try {
				Thread.sleep(1000);  //blocked or waiting state
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			//run method will completed Thread will terminate
	}
}

class ThreadDemo implements Runnable{

	@Override
	public void run() {
			System.out.println("Running implements runnable interface..."); //running state
			try {
				Thread.sleep(2000);  //blocked or waiting state
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			
			//run method will completed Thread will terminate
	}
}
public class ThreadMain {
	public static void main(String[] args) { //main method is also thread
		
		ThreadDemo1 th1 = new ThreadDemo1();
		th1.start();
		
		ThreadDemo th = new ThreadDemo();
		
		Thread t = new Thread(th); //Born or new state
		
		t.start(); //runnable or active state
		
		//or
		
		Runnable r = () -> {
			
			System.out.println("Running by lambda..."); //running state
			try {
				Thread.sleep(1000);  //blocked or waiting state
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			//run method will completed Thread will terminate
		};
		
		Thread t1 = new Thread(r);
		t1.start();
		
		//or
		
		Thread t2 = new Thread(() -> {
			
			System.out.println("Running by lambda shortcut..."); //running state
			try {
				Thread.sleep(1000);  //blocked or waiting state
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			//run method will completed Thread will terminate
		});
		
		t2.start();
	}
}
