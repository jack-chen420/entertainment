package demo000;

public class Mouse implements USB{

	@Override
	public void open() {
		// TODO Auto-generated method stub
		System.out.println("打开鼠标");
		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("关闭鼠标	");
	}
	
	public void click() {
		System.out.println("鼠标点啊");
		
	}
	

}
