
public class MainClass {
	public static void main(String args[]){
		TV haierTV = new TV();
		Familiy zhangSanFamiliy = new Familiy(haierTV);
		zhangSanFamiliy.remoteControl(10);
		System.out.println(zhangSanFamiliy.homeTV.getChannel());
	    zhangSanFamiliy.homeTV.showProgram();
	}
}
