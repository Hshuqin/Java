
public class MobileShop {
	InnerPurchaseMoney purchaseMoney1;
	private int mobileAmount;
	MobileShop(int b){
		int money=b;
		purchaseMoney1= new InnerPurchaseMoney(money);
	}
	void getMobileAmount(){
		System.out.println("�ֻ�ר����Ŀǰ���ֻ�"+mobileAmount+"���ֻ�");
	}
	void setMobileAmount(int m){
		mobileAmount = m;
		//System.out.println("�ֻ�ר����Ŀǰ���ֻ�"+mobileAmount+"���ֻ�");
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
			System.out.println("�ü�ֵ"+money+"���ڲ�����ȯ����"+mount+"���ֻ�");
		}
		
	}
	//void getAmount(){
		//System.out.println("�ֻ�ר����Ŀǰ��"+mobileAmount+"���ֻ�");
	//}
}
