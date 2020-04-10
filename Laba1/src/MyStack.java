import java.util.ArrayList;
import java.util.List;
public class MyStack {
	
	ArrayList<String> stack = new ArrayList<String>();

	public void push(String element) {
		stack.add(element);
	}

	public String pop() {
		String element = (String) stack.get(stack.size() - 1);
		stack.remove(stack.size() - 1);
		return element;
	}
}
