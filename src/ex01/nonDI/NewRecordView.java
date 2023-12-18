package ex01.nonDI;

public class NewRecordView {
	
	private NewRecord record;

	public NewRecordView(int kor, int eng, int com, int math) {  // 생성자 함수 
		record = new NewRecord(kor, eng, math, com);
	};
	
	public void print() {
		System.out.println("KOR : " + record.getKor());
		System.out.println(record.total() + "  /   "+ record.avg());
		System.out.println("----------------------");
		System.out.println(record); // toString() 함수 호출
	}
}
