
//Cross 인터페이스를 상속 받아 구현해 보자!
public class Main{
	public static void main(String[] args) {

		//암호화 정답 체크용
		String strIn = "HelloWorld";

		//문제 1.encryption메소드를 구현하여 strIn을 매개변수로
		//받아 문자를 유니코드로 출력하자
		//예) "가나다라"   >>>   35845 45884 36595 48452
		//숫자 사이에 빈칸을 추가해서 출력!


		//복호화 정답 체크용
		int[] check = {49901, 48516, 55092, 49885};

		//문제 2.Decryption를 구현하여 check를 매개변수로 받아
		//숫자를 한글로 출력하자
		//예) 35845 45884 36595 48452    >>>  "가나다라"
		//빈칸 없이 출력!

	}

}
