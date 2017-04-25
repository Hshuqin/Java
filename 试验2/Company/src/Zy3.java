import java.util.Scanner;

public class Zy3 {
	public static void main (String args[]){
		int  ypeople,mpeople,wpeople;
		System.out.println("请输入年工作者，月工作者，周工作者人数：（回车隔开）:");
		Scanner reader = new Scanner(System.in);
		Scanner reader1 = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		ypeople = reader.nextInt();
		mpeople = reader1.nextInt();
		wpeople = reader2.nextInt();
		Company X = new Company(ypeople,mpeople,wpeople);
		System.out.println("公司的薪水总额为："+X.AllEarning());
	}
}
