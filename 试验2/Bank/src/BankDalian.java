
public class BankDalian extends Bank{
	double year;
	public double computerInterest(){
		super.year=(int)year;
		double r = year-(int)year;
		int day=(int)(r*1000);
		double yearInterest = super.computerInterest();//
		double dayInterest = day*0.00015*savedMoney;
		interest = yearInterest+dayInterest;
		System.out.printf("%d元存在大连银行%d年零%d天：%f元\n",savedMoney,super.year,day,interest);
		return interest;
	}
	BankDalian(int s,double y){
		savedMoney = s;
		year = y;
	}
	
}
