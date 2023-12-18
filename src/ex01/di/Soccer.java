package ex01.di;

import org.springframework.beans.factory.annotation.Autowired;

public class Soccer {
	
	@Autowired  //자동 주입된다.
	private PlayerImpl player;

//	public void setPlayer(PlayerImpl player) {  // DI
//		this.player = player;
//	}
}

/*
	@Autowired : Type기반
	목적 : 의존관계를 자동설정할때 사용하면 [타입을 이용]하여 의존하는 객체를 삽입해 준다.
	그러므로 (IoC Container) 해당 타입의 빈객체가 존재하지 않거나 또는 2개 이상 존재할 경우 
	스프링은 예외를 발생시키게 된다.
	
	설정 위치 : 생성자, 필드, 메소드 (굳이 setter 메소드가 아니어도 된다).
	
	@Required
    Autowired 어노테이션을 적용한 프로퍼티에 대해 굳이 설정할 필요가 없는 경우에 
    false 값을 주며 이때 해당 프로퍼티가 존재하지 않더라도 스프링은 예외를 발생시키지 않는다. 디폴트가 true
*/