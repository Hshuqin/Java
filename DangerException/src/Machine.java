
public class Machine {
	Goods goods;
	Machine(Goods a){
		goods=a;
	}
	public void checkBag(Goods g) throws DangerException{
		goods=g;
		String str1 = "炸药";
		String str2 = "硫磺";
		String str3 = "硫酸";
		
		if (goods.name.equals(str1)||goods.name.equals(str2)||goods.name.equals(str3)){
			throw new DangerException(goods);
		}
		else 
			System.out.println(goods.name+"不是危险品！"+goods.name+"检查通过！");
	}
}
