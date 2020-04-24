import java.util.ArrayList;

public class MainProgram {

	public static void main(String[] args) {
		Planner plan = new Planner();
		plan.addProcess(new Process("name1", PriorityType.High, new ArrayList<Thread>()));	
		plan.addProcess(new Process("name2", PriorityType.Low, new ArrayList<Thread>()));	
		plan.addProcess(new Process("name3", PriorityType.Medium, new ArrayList<Thread>()));	
		plan.Run();
	}
}
