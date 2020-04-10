import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Arguments {
	
	private List<String> Arguments;	
	
	public Arguments(String... str) {
		Arguments  = Arrays.asList(str);
	}
	
	public List<String> get_list() {
		return Arguments ;
	}
}

