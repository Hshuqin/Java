import java.util.Scanner;

public class Zy3 {
	public static void main (String args[]){
		int  ypeople,mpeople,wpeople;
		System.out.println("�������깤���ߣ��¹����ߣ��ܹ��������������س�������:");
		Scanner reader = new Scanner(System.in);
		Scanner reader1 = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		ypeople = reader.nextInt();
		mpeople = reader1.nextInt();
		wpeople = reader2.nextInt();
		Company X = new Company(ypeople,mpeople,wpeople);
		System.out.println("��˾��нˮ�ܶ�Ϊ��"+X.AllEarning());
	}
}
