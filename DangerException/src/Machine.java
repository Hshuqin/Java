
public class Machine {
	Goods goods;
	Machine(Goods a){
		goods=a;
	}
	public void checkBag(Goods g) throws DangerException{
		goods=g;
		String str1 = "ըҩ";
		String str2 = "���";
		String str3 = "����";
		
		if (goods.name.equals(str1)||goods.name.equals(str2)||goods.name.equals(str3)){
			throw new DangerException(goods);
		}
		else 
			System.out.println(goods.name+"����Σ��Ʒ��"+goods.name+"���ͨ����");
	}
}
