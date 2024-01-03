package ex03.di.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import lombok.NoArgsConstructor;

@NoArgsConstructor   // default constuctor 
public class MoniterViewer {
	
	private Recorder recorder;  // has-a
	

//	@Inject
//	@Autowired(required = false) /* default : required = true */
//	public MoniterViewer(@Qualifier("key") Recorder recorder) {  // constructor method  DI
//		this.recorder = recorder;
//		System.out.println("@Autowired 자동 주입");
//	}
	
	@Autowired
//	@Qualifier("record4")  // id="record4"  // <qualifier /> 엘리먼트가 없어야함
//	@Qualifier("rr1")    // name="rr1"
//	@Qualifier("cord")   // <qualifier value="cord" />
	public void setRecorder(@Qualifier("record3") Recorder recorder) {  // setter method  DI
		this.recorder = recorder;
		System.out.println("555 setRecorder method call~~");
	}

	public void show() {
		recorder.show();
		System.out.println("MoniterViewer class show method call~~~~");
		System.out.println("setter method MoniterViewer class show method call~~~");
	}

/*
	 @Qualifier
	목적 : @Autowired의 목적에서 동일 타입의 빈객체가 존재시 특정빈을 삽입할 수 있게 설정한다. 
	설정위치 : @Autowired 어노테이션과 함께 사용된다.
	추가설정 : 동일타입의 빈객체 설정에서 <qualifier value="[alias명]" />를 추가하여 준다.
	옵션 : name - alias명
	
	
	@Autowired(required=false)
	@Autowired 부가적 설정 기능
	required=false 를 걸어놓으면 context(container)안에  
	injection 되는 타입의 객체(bean)가 존재하지 않아도 Error 없이 실행 가능
	
	같은 기능의 annotation
 */


}








