import java.util.Scanner;

public class FlowEx3 {

	
	public static void main(String[] args) {
		
//		사용자가 입력한 숫자가 0인지 아닌지 
//		판별하는 프로그램
		
		int userInputNum = 0;
		//String resultStr="";
		Scanner scan = new Scanner(System.in);
			
				
		System.out.println("숫자를 입력해 주세요");
		userInputNum = scan.nextInt();
		
		if (userInputNum == 0) {
		System.out.println("입력하신 숫자는 0입니다");
		}
		
	}

}

