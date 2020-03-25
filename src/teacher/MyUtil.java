package teacher;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyUtil extends Date{

	
	public String toString(){
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		return simpleDateFormat.format(this);
	}
	private MyUtil() {
	}
	

	public static Scanner getInputScan(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner;
	}
	
	public static int getInputNum(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner.nextInt();
	}
	
	public static String getInputStrr(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner.next();
	}
	
	public static Float getInputFloat(String msg,Scanner scanner) {
		System.out.println(msg);
		return scanner.nextFloat();
	}
	

}
