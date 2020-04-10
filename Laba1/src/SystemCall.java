

public class SystemCall {	
	private Arguments arguments;
	public SystemCall(Arguments arguments) {
		this.arguments = arguments;
	}

	public Arguments getArgs() {
		return arguments;
	}
	
	public String Execute(){

		return "Вызов выполнен";
	}
	
}