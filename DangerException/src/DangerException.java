
public class DangerException extends Exception{
	String message;
	public DangerException (Goods goods){
		message = "Σ��Ʒ��"+goods.name+"����ֹ��";
	}
	public String warnMess(){
		//System.out.println("������Ҫ������Ʒ���س�ȷ�ϣ�");
		return message;
	}
}
