package car.motion;

import car.engine.facade.CarEngineFacade;

public class Main {
	
	private static CarEngineFacade carEngineFacade;

	public static void main(String[] args) {

		carEngineFacade.startEngine();
		System.out.println("I'm going for 50 miles");
		carEngineFacade.stopEngine();
		

	}

}
