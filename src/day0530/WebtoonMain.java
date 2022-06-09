package day0530;

//아래의 웹툰 목록을 객체화하여 출력 결과와 같은 결과값을 나타내시오
//웹툰 목록
//	제목 : 나 혼자만 레벨업! 	장르 : 판타지  작가 : 나혼자
//	제목 : 스위트 집 		장르 : 스릴러  작가 : 김달콤
//	제목 : 이태원 클래식 		장르 : 드라마  작가 : 이태원

//출력 예 
//Webtoon {제목 : 나 혼자만 레벨업!, 	장르 : 판타지, 작가 : 나혼자}
//Webtoon {제목 : 스위트 집, 		장르 : 스릴러,  작가 : 김달콤}
//Webtoon {제목 : 이태원 클래식, 		장르 : 드라마,  작가 : 이태원}
//총 웹툰의 수 : 3


class Webtoon {
	String name;
	String genre;
	String writer;
	static int count = 0;
	
	public Webtoon(){}
	public Webtoon(String name, String genre, String writer){
		this.name = name;
		this.genre = genre;
		this.writer = writer;
		Webtoon.count++;
	}
	
	public void show() {
		System.out.println("Webtoon{제목 : " + name + ", 장르 : " + genre + ", 작가 : " + writer + "}");
	}
	public static int getCount() {
		return count;
	}
	
}

public class WebtoonMain {

	public static void main(String[] args) {
		
		Webtoon levelUp = new Webtoon("나 혼자만 레벨업!", "판타지", "나혼자");
		Webtoon sweetHome = new Webtoon("스위트홈", "스릴러", "김칸비, 황영찬");
		Webtoon itaewon = new Webtoon("이태원 클래쓰", "드라마", "광진");
		
		Webtoon webtoons[] = {levelUp, sweetHome, itaewon};
		
		for(int i = 0; i<webtoons.length; i++) {
			webtoons[i].show();
		}
		
//		levelUp.show();
//		sweetHome.show();
//		itaewon.show();
		
		System.out.println("총 웹툰의 수 : " + Webtoon.getCount());
		
		
	}

}
