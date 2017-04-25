
public class Gym implements Jiekou{
	int i=0;
	public double score[]= new double[50];
	double j,sum=0.0;
	Gym (){
		
	}
	public double ComputerAverage(){
		int j,t;
		double b,sum=0.0;
		for (j=0;j<i-1;j++){
			for (t=j+1;t<i;t++){
				if(score[j]<=score[t]){
					b=score[j];
					score[j]=score[t];
					score[t]=b;
				}
			}
		}
		for(t=1;t<i-1;t++){
			sum=sum+score[t];
		}
		b=(i-2)/1.0;
		return sum/b;
	}
}
