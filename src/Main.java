import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		int min = 0;
		int max = 0;
		
		System.out.println("Въведи числа: ");
		
	for(int i =0; i<5; i++){
		int number = scan.nextInt();
		
		if(i==0){
			min=number;
			max = number;
			
		}else{
			if(min>number){
			}
			if(max<number){
				max=number;
				
			}
		}
	}
	System.out.print(min);
	System.out.print(max);
	}
	
}
