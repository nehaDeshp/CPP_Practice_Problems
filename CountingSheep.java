package numberlogics;

import java.util.Scanner;

public class CountingSheep {
	public static void main(String[] args) {
		char arr[] = new char[10];
		int cnt=1,tc=0;
		int p=0;
		Scanner sc = new Scanner(System.in);
		tc = sc.nextInt();
		int num[] =  new int[tc];
		
		
		while(p<tc){
			num[p] = sc.nextInt();
			p++;
		}
		boolean full =false;
		p=0;
		while(p<tc){
			if(num[p] == 0){
				System.out.println("Case #"+(p+1)+": INSOMNIA");
			}
			else{
				while(!full){
					int val = cnt*num[p];
					int tmp;
					while(val>0){
						tmp=val%10;
						arr[tmp] = 'X';
						val = val/10;
						//System.out.println(cnt);
					}
					cnt++;
					int i;
					//System.out.println(cnt);
					
						for(i=0;i<10;i++){
							if(arr[i] != 'X'){
								break;
							}
							//System.out.println(i+" -->i"); 
						}
						if(i==10){
							//System.out.println(cnt);
							System.out.println("Case #"+(p+1)+": "+((cnt-1)*num[p]));
							full=true;
						}
					
				}
				full=false;
			}
			p++;
			cnt=0;
			arr = new char[10];
		}
		sc.close();
	}
}
