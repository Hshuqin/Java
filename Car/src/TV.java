
public class TV implements Jiekou{
	double weight=20;
	int numb;
	TV(int a){
		numb=a;
	}
	TV(){
		
	}
	public double computerWeight(){
		return weight*numb;
	}
}
