package ex06.aop.annot;

import lombok.Setter;

@Setter
public class Worker {  // 직장인 클래스
	
	private String name;
	private int age;
	private String job;
	
	
	public void getWorkerInfo() {
		System.out.println("이름 : "+ this.name);
		System.out.println("나이 : "+ this.age);
		System.out.println("직업 : "+ this.job);
	}
}
