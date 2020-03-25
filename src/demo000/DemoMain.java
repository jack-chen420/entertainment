package demo000;

public class DemoMain {
	public static void main(String[] args) {
		Computer computer=new Computer();
		computer.powerOn();
		USB mouseUsb=new Mouse();
		computer.useDevice(mouseUsb);
		Keyboard keyboard=new Keyboard();
		computer.useDevice(keyboard); 
		computer.powerOff();
	}
}
