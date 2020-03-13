package controller;

public class ThreadExer extends Thread {
	
	private int id;

	public ThreadExer(int id) {
	
		this.id = id;
	}
	
@Override
public void run() {
	
	showThreadId(id);
	
	super.run();
}

	private void showThreadId(int id) {
		
		System.out.println(id + "; " + getId());
	}

}
