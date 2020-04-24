
public class Thread {

	private String name;
	private int totalTime;
	private int curTime;
	
	public Thread(String name, int totalTime) {
		this.name = name;
		this.totalTime = totalTime;		
	}		

	public int getCurTime() {
		return curTime;
	}

	public void setCurTime(int curTime) {
		this.curTime = curTime;
	}

	public boolean needTime() {
		return totalTime > curTime;
	}
	public String getName() {
		return name;
	}
 
}
