import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("�������ֻ����ֻ��������ڲ�����ȯ��ֵ��");
		int Amount = reader.nextInt();
		int inter = reader.nextInt();
		MobileShop mobiles = new MobileShop(inter);
		mobiles.setMobileAmount(Amount);
		mobiles.getMobileAmount();
		mobiles.purchaseMoney1.setPurchaseMoney();
		mobiles.getMobileAmount();
	}
}
