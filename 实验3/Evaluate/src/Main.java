import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		//double score[] = new double[50];
		
		Gym gym = new Gym();
		School stu = new School();
		System.out.println("体操运动员请按1输入分数，学生请按0输入分数：");
		Scanner reader1 = new Scanner(System.in);
		int y = reader1.nextInt();
		if(y==1){
			System.out.println("请输入若干个成绩，回车隔开，按0键结束；");
			Scanner reader = new Scanner(System.in);
			double x=reader.nextDouble();
			while(x!=0){
				gym.score[gym.i]=x;
				gym.i++;
				x=reader.nextDouble();
			}
			System.out.println("体操运动员的平均成绩为："+gym.ComputerAverage());
		}
		else if (y==0){
			System.out.println("请输入若干个成绩，回车隔开，按0键结束；");
			Scanner reader = new Scanner(System.in);
			double x=reader.nextDouble();
			while(x!=0){
				stu.score=x;
				stu.i++;
				stu.sum=stu.sum+stu.score;
				x=reader.nextDouble();
			}
			System.out.println("学生的平均成绩为"+stu.ComputerAverage());
		}
		else{
			System.out.println("不符合规范！！！");
		}
		
	}
}
