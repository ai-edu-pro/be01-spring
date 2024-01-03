package ex04.di.resource;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;

public class MoniterViewer {
	
	private Recorder recorder;  // has-a

	
//	@Resource(name = "r3")    // id
//	@Resource @Qualifier("y")
	
//	@Resource
//	public void setRecorder(@Qualifier("y") Recorder recorder) { 
	
	@Resource(name = "x")  // name
	public void setRecorder(Recorder recorder) {  // DI
		this.recorder = recorder;
		
		boolean record = Resource.class.getTypeName().contains("record1");
		System.out.println(record);
		
		System.out.println(!Resource.class.getTypeName().contains("record1"));
		System.out.println(Resource.class.getTypeName().equals("record1"));
		
		System.out.println(Resource.AuthenticationType.class);
		System.out.println("-------------------------------");
		recorder.show();
		System.out.println(recorder);
		System.out.println("@Resource 주입");
	}
	
	
/*
 * @Resource
목적 : 어플리케이션에서 필요로 하는 자원을 자동 연결(의존하는 빈 객체 전달)할 때 사용
       @Autowired 와 같은 기능을 하며 
       @Autowired와 차이점은 
       @Autowired는 타입으로(by type),  
       @Resource는 이름으로(by name)으로 연결시켜준다는 것이다.
		설정위치 : 프로퍼티, setter메소드
		추가설정 : CommonAnnotationBeanPostProcessor 클래스를 빈으로 등록시켜줘야 한다. 
		해당 설정 대신에 <context:annotation-config> 태그를 사용해도 된다.
		옵션 : name 	
 */



}








