package chiHuo;

public class Wait {
	public static void main(String[] args) {
		Object ob=new Object();
		//消费者
		new Thread() {
			@Override
			public void run() {
				while (true) {
					synchronized (ob) {
						System.out.println("g告诉老板");
						try {
							ob.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("做好，准备开吃 ");
						System.out.println("-----------------");
					}
					
				}
			}
	}.start();
	
	//老板
	new Thread() {
		public void run() {
		while (true) {
			//花5秒做包子
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			
			synchronized (ob) {
		
				System.out.println("老板五秒之后做好包子");
				ob.notify();
				
			}
		}
		}
	
	}.start();
}
}