package javaprj.day09.캡슐화하기.나해수;
//객체지향
public class chiikawa {
	
	String name;
	String author;
	String summary;
	String[] character;
	
	public  void 입력하기(String name, String author, String summary, String[] character) {
		this.name = name;
		this.author = author;
		this.summary = summary; 
		this.character = character;
	}
	
	public  void 출력하기() {
		System.out.println("[이름]");
	    System.out.println(this.name);

	    System.out.println("\n[작가]");
	    System.out.println(this.author);

	    System.out.println("\n[줄거리]");
	    System.out.println(this.summary);

	    System.out.println("\n[캐릭터]");
	    for(int i=0; i<this.character.length; i++) {
	    System.out.println(this.character[i]);
	    }
	}

}
