
public class Vehicle {
	double speed;
	int power;
	Vehicle (){
	}
	void speedUp(int a){
		 speed=speed+a;
	}
	void speedDown(int a){
		 speed=speed-a;
	}
	void setPower(int b){
		power = b;
	}
	void setSpeed(double s){
		speed=s;
	}
	int getPower(){
		return power;
	}
	double getSpeed(){
		return speed;
	}
}
