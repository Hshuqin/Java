import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		//double score[] = new double[50];
		
		Gym gym = new Gym();
		School stu = new School();
		System.out.println("����˶�Ա�밴1���������ѧ���밴0���������");
		Scanner reader1 = new Scanner(System.in);
		int y = reader1.nextInt();
		if(y==1){
			System.out.println("���������ɸ��ɼ����س���������0��������");
			Scanner reader = new Scanner(System.in);
			double x=reader.nextDouble();
			while(x!=0){
				gym.score[gym.i]=x;
				gym.i++;
				x=reader.nextDouble();
			}
			System.out.println("����˶�Ա��ƽ���ɼ�Ϊ��"+gym.ComputerAverage());
		}
		else if (y==0){
			System.out.println("���������ɸ��ɼ����س���������0��������");
			Scanner reader = new Scanner(System.in);
			double x=reader.nextDouble();
			while(x!=0){
				stu.score=x;
				stu.i++;
				stu.sum=stu.sum+stu.score;
				x=reader.nextDouble();
			}
			System.out.println("ѧ����ƽ���ɼ�Ϊ"+stu.ComputerAverage());
		}
		else{
			System.out.println("�����Ϲ淶������");
		}
		
	}
}
