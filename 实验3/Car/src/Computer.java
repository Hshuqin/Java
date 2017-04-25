
public class Computer implements Jiekou{
	double weight=5;
	int nomb;
	Computer(int a){
		nomb=a;
	}
	Computer(){
		
	}
	public double computerWeight(){
		return nomb*weight;
	}
}
