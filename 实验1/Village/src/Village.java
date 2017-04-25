
public class Village {
	static int waterAmount;
	Village(int a){
		waterAmount = a;
	}
	Village(){
		
	}
	void changeWater(int a){
		waterAmount-=a;
	}
	int watchWater(){
		return waterAmount;
	}
}
