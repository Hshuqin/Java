import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		System.out.println("������������ԣ����ӻ���ϴ�»�������");
		Scanner reader = new Scanner(System.in);
		int a=reader.nextInt();
		int b=reader.nextInt();
		int c=reader.nextInt();
		//System.out.println(a);
		Truck tru = new Truck(a,b,c);
		System.out.println("����װ�صĻ���������"+tru.AllWeight()+"Kg");
	}
}
