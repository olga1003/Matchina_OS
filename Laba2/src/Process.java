import java.util.ArrayList;
import java.util.Random;

public class Process {

	private String name;
	private ArrayList<Thread> threads;
	private PriorityType priority;
	Random rnd = new Random();
	public Process(String name, PriorityType priority, ArrayList<Thread> threads) {
		this.name = name;
		this.priority = priority;
		this.threads = threads;
		threads.add(new Thread("nameThread1", rnd.nextInt(500)+1));
		threads.add(new Thread("nameThread2", rnd.nextInt(500)+1));
		threads.add(new Thread("nameThread3", rnd.nextInt(500)+1));			
	}
	
	public String getName() {
		return name;
	}
	
	public ArrayList<Thread> getThreads() {
		return threads;
	}
	
	public void Run() {	
		System.out.println("Процесс " + name + " начался");

		int sizeThread = threads.size();
		int timeForThread = priority.getTime()/sizeThread;
	
		if(timeForThread < 1) {
			timeForThread = 1;
		}
		
		for( int i = 0; i < threads.size(); i++) {
			Thread thread = threads.get(i);
			
			if(thread.needTime() == false) {
				System.out.println("Поток " + thread.getName() + " процесса " + getName() + " удален");
				threads.remove(i);	
			}
				
			if(thread.needTime() == true) {
				thread.setCurTime(thread.getCurTime() + timeForThread);
			}					
		}
		System.out.println("Процесс " + name + " приостановлен");
	}
}
