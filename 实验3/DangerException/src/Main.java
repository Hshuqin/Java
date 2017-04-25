import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		System.out.println("请输入要检查的物品，回车确认：");
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
				System.out.println("请继续 输入要检查的物品，回车确认（或 按0键结束检查 ）：");
				str = reader.nextLine();
		}
		System.out.println("程序结束！");
	}
}
