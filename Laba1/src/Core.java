import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;


public class Core {
	
	private Stack<String> stack;	
	public HashMap<Integer, SystemCall> SystemCalls;	
	
	public Core(Stack<String> stack)
	{
		this.stack = stack;	
		SystemCalls = new HashMap<Integer, SystemCall>();		
		SystemCalls.put(14,new SystemCall(new Arguments("arg")));
		SystemCalls.put(25,new SystemCall(new Arguments("arg")));
		SystemCalls.put(36,new SystemCall(new Arguments("arg3", "arg3", "arg3")));
		SystemCalls.put(37,new SystemCall(new Arguments("arg", "arg")));
		SystemCalls.put(28,new SystemCall(new Arguments("arg", "arg", "arg","arg","arg")));
	}

	public void ExecuteCall(int id){		
		if (SystemCalls.containsKey(id) == false){
			System.out.print("����� ����� " + id + " �� ����������\n");
			return;
		}		
		if (stack.size() != SystemCalls.get(id).getArgs().get_list().size()){

			System.out.print("��������� �� ���������");
			return;
		}		
		
		for (int i = SystemCalls.get(id).getArgs().get_list().size() - 1; i >= 0; i--) {			
			if (!stack.pop().equals(SystemCalls.get(id).getArgs().get_list().get(i))) {
				System.out.print("��������� �� ���������");
				return;
			}
		}
		
		System.out.print(SystemCalls.get(id).Execute());
	}		
	public void Calls()
	{
		SystemCalls.entrySet().forEach(entry -> System.out.println(entry.getKey() + " " + " " + entry.getValue().getArgs()));
	}	
}