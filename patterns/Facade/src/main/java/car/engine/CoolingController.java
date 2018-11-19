package car.engine;

public class CoolingController {
	private Radiator radiator;
	private TemperatureSensor temperatureSensor;
	private int defaultCoolingTemp;
	
	public void setTemperatureUpperLimit(int defaultCoolingTemp) {
		this.defaultCoolingTemp = defaultCoolingTemp;
	};
	public void run() {};
	public void on() {};
	public void stop() {}
	public void cool(int maxAllowedTemp) {};
	
	
}
