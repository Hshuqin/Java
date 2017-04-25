
public class Zy2 {
	public static void main(String args[]){
		BankDalian bd = new BankDalian(8000,8.236);
		ConstructionBank cb = new ConstructionBank(8000,8.236);
		double cbinterest=cb.computerInterest();
		double bdinterest=bd.computerInterest();
		//double cbinterest=cb.computerInterest();
		System.out.printf("两个银行利息相差%f元.\n",bdinterest-cbinterest);
		
	}
}
