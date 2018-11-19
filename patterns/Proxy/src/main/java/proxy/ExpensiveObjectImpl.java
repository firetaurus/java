package proxy;

import java.util.logging.Logger;

public class ExpensiveObjectImpl implements ExpensiveObject{

	
	public ExpensiveObjectImpl() {
		initialHeavyConfiguration();
	}
	
	private void initialHeavyConfiguration() {
		System.out.println("Initial heavy configuration");
		
	}

	public void process() {
		System.out.println("processing request..");
	}
	
	

}
