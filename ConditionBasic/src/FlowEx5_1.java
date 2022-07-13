import java.util.Scanner;

public class FlowEx5_1 {

	
	public static void main(String[] args) {
		
//		중첩 if문
//		
//		if(조건식1) {
//			조건식의 연산결과가 ture일 때
//			if(조건식2) {
//				조건식2의 연산결과가 ture일 때
//			}else {
//				조건식1이 ture이고, 조건식2가 false일 때
//		
//			
//		}else {
//			조건식1이 false일 때
//		}
//		95점이상이면 A+등급
//		93~94점은  A등급
//		92점이하면 A-등급
		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = "";
		
		
		if (score >= 95) {
			grade = grade + "A+";
		}else if (score >= 92) {
			grade = grade + "A";
		}else if (score >= 90) {
			grade = grade + "A-";
		}else if (score >= 85) {
			grade = grade + "B+";
		}else if (score >= 82) {
			grade = grade + "B";
		}else if (score >= 80) {
			grade = grade + "B-";
		}else {
			grade = grade + "F";
		} // if end

		System.out.println("당신의 점수는 " + score + "점 입니다." 
			+ "등급은 " + grade + " 입니다.");
		
		
		
		
	}
}
		
		
	



