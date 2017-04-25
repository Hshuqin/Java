import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner reader = new Scanner(System.in);
		System.out.println("请输入手机店手机总数和内部购物券价值：");
		int Amount = reader.nextInt();
		int inter = reader.nextInt();
		MobileShop mobiles = new MobileShop(inter);
		mobiles.setMobileAmount(Amount);
		mobiles.getMobileAmount();
		mobiles.purchaseMoney1.setPurchaseMoney();
		mobiles.getMobileAmount();
	}
}
