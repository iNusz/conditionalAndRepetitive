package conditionalAndRepetitive;

public class SwitchNoBreak1 {

	public static void main(String[] args) {
		int time = (int)(Math.random()*4) + 9; 
		System.out.println("[현재시간 :" + time + "시]" );
		
		switch(time) {
		
		case 8:
			System.out.println("출근합니다");
		//	break;
		case 9:
			System.out.println("회의를 합니다");
		//	break;
		case 10:
			System.out.println("업무를 봅니다");
		//	break;
		default:
			System.out.println("점심을 먹습니다");
		}

	}

}
