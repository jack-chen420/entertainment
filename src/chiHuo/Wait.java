package chiHuo;

public class Wait {
	public static void main(String[] args) {
		Object ob=new Object();
		//������
		new Thread() {
			@Override
			public void run() {
				while (true) {
					synchronized (ob) {
						System.out.println("g�����ϰ�");
						try {
							ob.wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println("���ã�׼������ ");
						System.out.println("-----------------");
					}
					
				}
			}
	}.start();
	
	//�ϰ�
	new Thread() {
		public void run() {
		while (true) {
			//��5��������
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();}
			
			synchronized (ob) {
		
				System.out.println("�ϰ�����֮�����ð���");
				ob.notify();
				
			}
		}
		}
	
	}.start();
}
}