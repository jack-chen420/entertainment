package demo000;

public class Keyboard implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开键盘");
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭键盘");
	}
	
	public void type() {
		System.out.println("打字");
		
	}
}
