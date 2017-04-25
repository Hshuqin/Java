
public class DangerException extends Exception{
	String message;
	public DangerException (Goods goods){
		message = "危险品！"+goods.name+"被禁止！";
	}
	public String warnMess(){
		//System.out.println("请输入要检查的物品，回车确认：");
		return message;
	}
}
