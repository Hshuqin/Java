
public class User {
	public static void main(String args[]){
		Vehicle vehicle = new Vehicle();
		vehicle.setPower(100);
		vehicle.setSpeed(150.0);
		vehicle.getPower();
		System.out.println(vehicle.getPower());
		vehicle.speedUp(100);
		System.out.println(vehicle.getSpeed());
		vehicle.speedDown(100);
		System.out.println(vehicle.getSpeed());
		
	}
}
