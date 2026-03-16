package javaprj.day09.캡슐화하기.조아진;

public class 실습_롤챔피언 {
	String name;          // 챔피언 이름 
    String lane;          // 주로 가는 라인 (바텀, 미드, 탑 등)
    String role;          // 역할군 (원거리 딜러, 마법사, 암살자 등)
    String damageType;    // 데미지 유형 (AD(물리 피해), AP(마법 피해))
    int hp;               // 기본 체력 
    String ultimateSkill; // 궁극기(R 스킬) 이름
    
    
    void inputChampion(String name, String lane, String role, String damageType, int hp, String ultimateSkill) {                  
        this.name = name;                   
        this.lane = lane;                  
        this.role = role;                   
        this.damageType = damageType;       
        this.hp = hp;                       
        this.ultimateSkill = ultimateSkill; 
    } // 여기 있는 this는 객체 정보 없음!!!! this 객체는 new라는 과정을 거쳐야 정보가 담겨짐
    
    void printChampion() {
        System.out.println("🎮 League Of Legend Champion 🎮");
        System.out.println("🗡️ 챔피언: " + this.name);
        System.out.println("🗡️ 라인: " + this.lane);
        System.out.println("🗡️ 역할군: " + this.role);
        System.out.println("🗡️ 공격 타입: " + this.damageType);
        System.out.println("🗡️ 기본 체력: " + this.hp);
        System.out.println("🗡️ 궁극기(R): " + this.ultimateSkill);
        System.out.println("===========================================");
        System.out.println();
    }
}
