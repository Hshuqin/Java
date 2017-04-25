
public class Truck {
	Jiekou Cw[] = new Jiekou[3];
	Truck(int a,int b,int c){
		Jiekou comp = new Computer(a);
		Jiekou tv = new TV(b);
		Jiekou washm = new WashMachine(c);
		Cw[0]=comp;
		Cw[1]=tv;
		Cw[2]=washm;
	}
	double AllWeight(){
		return Cw[0].computerWeight()+Cw[1].computerWeight()+Cw[2].computerWeight();
	}
}
