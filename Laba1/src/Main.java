import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		Stack<String> stack = new Stack<>();
		Core core = new Core(stack);
		
		while(true){
			System.out.print("\n");
			String line = scanner.nextLine();
			if (line.equals("all")){
				core.Calls();
			}
			else {
				String[] lineSplit = line.split(" ");
				if (!lineSplit[0].equals("call") || line.equals("call")) {
					System.out.print(" Неверная команда\n");
				} else {
					int id = Integer.parseInt(lineSplit[1]);
					for (int i = 2; i < lineSplit.length; i++) {
						stack.push(lineSplit[i]);
					}
					core.ExecuteCall(id);
					while(true) {
						try {
							stack.pop();
						} catch(Exception ex) {
							break;
						}
					}
				}
			}
		}
	}
}