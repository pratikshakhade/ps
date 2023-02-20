package collection;

import java.util.Comparator;

public class compatorC implements Comparator<CompatorEmployee>{
	@Override
	public int compare(CompatorEmployee o1, CompatorEmployee o2) {
		// TODO Auto-generated method stub
		if(o1.sallary==o2.sallary) {
			return 0;
		}else if(o1.sallary>o2.sallary) {
			return 1;
		}else {
			return -1;
			
		}
	}
	

}
