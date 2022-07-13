
public class RandomNumberEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		랜덤한 숫자
//		임의의 숫자를 구하는 방법
		
		int rndNum = 0; 
		
		rndNum = (int)(Math.random() *10);
		
		rndNum = rndNum * 100;
		switch(rndNum) {
			case 100:
				System.out.println("당신의 번호는 100이고 ,상품은 자전거입니다.");
				break;
			case 200:
				System.out.println("당신의 번호는 200이고 ,상품은 TV입니다.");
				break;	
			case 300:
				System.out.println("당신의 번호는 300이고 ,상품은 노트북입니다.");
				break;
			case 400:
				System.out.println("당신의 번호는 400이고 ,상품은 자동차입니다.");
				break;
			case 500:
				System.out.println("당신의 번호는 500이고 ,상품은 컴퓨터입니다.");	
				break;
			default:
//				System.out.println("당신의 번호는 "+(rndNum * 100) +" 번입니다");
				System.out.println("당신의 번호는 "+ rndNum + " 번입니다");
				System.out.println("꽝 다음기회를 기대해주세요");
				break;
		}
		
		
		
		
		
	}

}
