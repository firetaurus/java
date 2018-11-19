package proxy;

public class ExpensiveObjectProxy implements ExpensiveObject{

	private static ExpensiveObject object;
	
	public void process() {
		
		if(object == null) {
			object = new ExpensiveObjectImpl();
		}
		object.process();
	}
	

}
