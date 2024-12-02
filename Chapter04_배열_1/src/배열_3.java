

public class 배열_3 {
	public static void main(String[] args) {
		int[] lotto = new int[6];
		int su=0;
		boolean  bCheck=false;
		for(int i=0;i<lotto.length;i++) {
			bCheck =true;
			while(bCheck) {
				su=(int)(Math.random()*45)+1;
				bCheck =false;
				
				for(int j=0;j<i;j++) {
					if(lotto[j]==su)
					{
						bCheck=true;
						break;
					}
				}
			}
			lotto[i]=su;
		}
		
	}

}
