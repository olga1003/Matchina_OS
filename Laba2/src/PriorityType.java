public enum PriorityType {
	High(500),
	Medium(250),
	Low(70);
	
	private int time;
	
	PriorityType(int time) {
		this.time = time;
	}
	
	public int getTime() {
		return time;
	}
}
