import java.util.ArrayList;

public class Planner {

	private ArrayList<Process> processes;

	public Planner() {
		processes = new ArrayList<Process>();
	}

	public void addProcess(Process process) {
		processes.add(process);
	}

	public void Run() {
		while(processes.size() > 0) {
			int sizeProcess = processes.size();

			for( int i = 0; i < sizeProcess; i++) {
				
				Process process = processes.get(i);
				process.Run();	
				if(process.getThreads().size() == 0) {
					System.out.println("Процесс " +  process.getName() + " завершен");
					processes.remove(i);
					sizeProcess--;					
				}			
		
			}
			
			if(sizeProcess == 0) {
				System.out.println("Все процеесы завершены ");			
			}
		}
	}
}