import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		System.out.println("������Ҫ������Ʒ���س�ȷ�ϣ�");
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		while(!str.equals("0")){
		    Goods goods = new Goods(str);
			Machine machine = new Machine(goods);
				try{
					machine.checkBag(goods);
				}
				catch(DangerException e){
						System.out.println(e.warnMess());
					}
				System.out.println("����� ����Ҫ������Ʒ���س�ȷ�ϣ��� ��0��������� ����");
				str = reader.nextLine();
		}
		System.out.println("���������");
	}
}
