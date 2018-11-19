package car.engine.facade;

import car.engine.AirFlowController;
import car.engine.CoolingController;
import car.engine.FuelInjector;
import car.engine.Starter;

public class CarEngineFacade {
	
	private static final int DEFAULT_COOLING_TEMP = 90;
	private static final int MAX_ALLOWED_TEMP = 50;
	private static AirFlowController airFlowController;
	private static FuelInjector fuelInjector;
	private static Starter starter;
	private static CoolingController coolingController;
	
	public void startEngine() {
		//this is the start engine
		airFlowController.takeAir();
		fuelInjector.on();
		fuelInjector.inject();
		starter.start();
		coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
		coolingController.run();
		coolingController.on();
		System.out.println("Car is on...");
	}
	
	public void stopEngine() {
		
		//this is the stop engine
		fuelInjector.off();
		coolingController.cool(MAX_ALLOWED_TEMP);
		coolingController.stop();
		airFlowController.off();
		System.out.println("Car is stopped...");
	}
	
	
	

}
