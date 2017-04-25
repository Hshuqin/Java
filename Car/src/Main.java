import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		System.out.println("请依次输入电脑，电视机，洗衣机数量：");
		Scanner reader = new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		//System.out.println(a);
		Truck tru = new Truck(a,b,c);
		System.out.println("货车装载的货物重量："+tru.AllWeight()+"Kg");
	}
}
