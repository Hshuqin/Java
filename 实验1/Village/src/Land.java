
public class Land {
	public static void main(String args[]){
		Village changeVillage = new Village(100);
		Village watchVillage = new Village();
		changeVillage.changeWater(10);
		System.out.println(changeVillage.watchWater());
		watchVillage.watchWater();
		System.out.println(watchVillage.watchWater());
	}
}
