
public class Company {
	double ypeople,mpeople,wpeople;
	Employee yw = new YearWorker();
	Employee mw = new MonthWorker();
	Employee ww = new WeekWorker();
	Company(int a,int b,int c){
		ypeople=a;
		mpeople=b;
		wpeople=c;
	}
	
	double AllEarning(){
		double ymonny,mmonny,wmonny;
		ymonny=yw.earning();
		mmonny=mw.earning();
		wmonny=ww.earning();
		return ypeople*ymonny*1+mpeople*mmonny*12+wpeople*wmonny*52;
	}
}
