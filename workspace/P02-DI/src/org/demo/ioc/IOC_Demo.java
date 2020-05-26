package org.demo.ioc;

class Car{
	private Engine engine;
	
	public Car(Engine e) {
		this.engine = e;
//		this.engine = new EngineA();
//		this.engine = new EngineB();
	}
	
	public void start() {
		engine.run();
	}
}

interface Engine{

	public void run();
	
}
class EngineA implements Engine{
	public void run() {
		System.out.println("EngineA started");
	}	
}
class EngineB implements Engine{
	public void run() {
		System.out.println("EngineB started");
	}	
}

public class IOC_Demo {

	public static void main(String[] args) {
		Car bmw = new Car(new EngineA());
		bmw.start();
		
		Car maruti = new Car(new EngineB());
		maruti.start();
		Car maruti2 = new Car(new EngineA());
		maruti2.start();
	}
}
