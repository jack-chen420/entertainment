package demo000;

public class Keyboard implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("�򿪼���");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("�رռ���");
	}
	
	public void type() {
		System.out.println("����");
		
	}
}
