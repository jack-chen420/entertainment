package demo000;

public class Computer {
	public void powerOn() {
		System.out.println("�ʼǱ�����");
	}
	public void powerOff() {
		System.out.println("�ʼǱ��ػ�");
	}
	public void useDevice(USB usb) {
		usb.open();
		if(usb instanceof Mouse) {
			Mouse mouse=(Mouse) usb;
			mouse.click();
		}else if (usb instanceof Keyboard) {
			Keyboard keyboard=(Keyboard) usb;
			keyboard.type();
		}
		usb.close();
	}
	
}
