import java.util.Scanner;

public class FlowEx5 {

	public static void main(String[] args) {
			
//	중첩 if문
//	
//	if(조건식1) {
//		조건식1의 연산결과가 true일 때
//		
//		if(조건식2) {
//			조건식2의 연산결과가 true일 때
//		}else {
//			조건식1이 true이고, 조건식2가 false일 때
//		}
//			
//	}else {
//		조건식1이 false일 때
//	}
		
//		95점 이상이면 A+등급
//		93점~94점은 A등급
//		92면이하면 A-등급
		
		Scanner scan = new Scanner(System.in);

		System.out.println("점수를 입력하세요.");
		int score = scan.nextInt();
		String grade = "";

		if (score >= 90) {
			grade = "A";
			
			if(score >=95) {
				grade = grade + "+";
			}
			
			if(score <=92) {
				grade = grade + "-";
			}
				
		} else if (score >= 80) {
			grade = "B";
			
			if(score >=85) {
				grade = grade + "+";
			}
		
			if(score <=82) {
				grade = grade + "-";
			}
		} else if (score >= 70) {
			grade = "C";
			
			if(score >=75) {
				grade = grade + "+";
			}
		
			if(score <=72) {
				grade = grade + "-";
			}
		} else if (score >= 60) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("당신의 점수는 " + score + "점 입니다." 
			+ "등급은 " + grade + " 입니다.");
		
//		scan.close();

	}
	
}
