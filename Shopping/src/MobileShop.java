
public class MobileShop {
	InnerPurchaseMoney purchaseMoney1;
	private int mobileAmount;
	MobileShop(int b){
		int money=b;
		purchaseMoney1= new InnerPurchaseMoney(money);
	}
	void getMobileAmount(){
		System.out.println("手机专卖店目前有手机"+mobileAmount+"部手机");
	}
	void setMobileAmount(int m){
		mobileAmount = m;
		//System.out.println("手机专卖店目前有手机"+mobileAmount+"部手机");
	}
	public class InnerPurchaseMoney{
		int money;
		int mount;
		InnerPurchaseMoney(){
			
		}
		InnerPurchaseMoney(int a){
			money=a;
		}
		void setPurchaseMoney(){
			mount=money*3/10000;
			mobileAmount = mobileAmount - mount;
			System.out.println("用价值"+money+"的内部购物券买了"+mount+"部手机");
		}
		
	}
	//void getAmount(){
		//System.out.println("手机专卖店目前有"+mobileAmount+"部手机");
	//}
}
