package javaprj.day09.캡슐화하기.나해수;
//객체
public class chiikawa2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		String name;
		String author;
		String summary;
		String[] character;
		*/
		chiikawa cikw = new chiikawa();
		
		cikw.입력하기("치이카와(먼작귀-뭔가 작고 귀여운 녀석)", "nagano/나가노", "귀여운 캐릭터, 밝은 분위기로 진행되는 스토리와 대조되는 부조리함이 녹아든 설정이 특징으로, 2020년대에 일본과 한국을 비롯한 해외에서 최고의 인기를 누리고 있는 캐릭터 IP다.\n"
				+ "처음 보면 귀여운 캐릭터들이 단순히 놀고먹는 가벼운 아동만화 같지만 계속 보다 보면 다크 판타지스러운 면이 있고 사실 이들도 먹고 살기 쉽지 않다는 것을 알 수 있다.\n"
				+ "작고 귀여운 햄스터 같은 캐릭터 치이카와와 친구들이 토벌(몬스터 사냥), 제초 등 힘든 노동을 통해 돈을 벌고, 자격증을 따며 살아가는 현실적이고도 부조리한 일상을 다룬 인기 만화이다.\n귀여움 속에 가난, 랭킹, 생존이라는 다소 암울한 소재가 숨겨져 있는 것이 특징이다. ", 
				new String[] {"치이카와", "하치와레(가르마)", "우사기(토끼)", "쿠리만쥬(밤만쥬)", 
			"모몽가(하늘다람쥐)", "랏코(해달)", "시사", "카니", "별똥별", "갑옷씨들"});
		
		cikw.출력하기();
		
	}
	

}
