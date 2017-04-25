
public class WashMachine implements Jiekou{
	double weight=500;
	int numb;
	WashMachine (int a){
		numb=a;
	}
	WashMachine(){
		
	}
	public double computerWeight(){
		return weight*numb;
	}
}
