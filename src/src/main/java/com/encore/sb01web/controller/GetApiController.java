package com.encore.sb01web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.encore.sb01web.dto.UserDto;

@RestController
@RequestMapping("/api/get")   //  GET , http://localhost:8080/api/get/hello
public class GetApiController {

//	@GetMapping("/hello")   // @RequestMapping(path = "/api/get/hello", method = RequestMethod.GET)
	@GetMapping(path = "/hello") 
	public String getHello() {
		return "<h1>Hello SpringBoot</h1>";
	}
	
	@RequestMapping(path = "/hi", method = RequestMethod.GET)   // http://localhost:8080/api/get/hi
	public String hi() {    
		
		return "<h1><font color='red'>hi~~~</font></h1>";
	}
	
	//http://localhost:8080/api/get/path-variable/kingsmile
	
//	@GetMapping("pathVariable/{id}")  // cf)  http://localhost:8080/api/get/pathVariable/doyeon, 주소줄에 대문자 안쓴다.
	@GetMapping("/path-variable/{id}")  //매번 주소가 변화 되는 내용을 받겠다면 {} 변경될 내용 기재
//	public String pathVariable(@PathVariable String id) {
	public String pathVariable(@PathVariable(name = "id") String pathId) {
		
		System.out.println("PathVariable : " + pathId);
		return pathId;
	}
	
	//구글에서 검색어 yuna 로 검색 결과
//	https://www.google.com/
//	search?q=yuna
//	&sca_esv=593016252
//	&sxsrf=AM9HkKnbs2mzV2KmwIiKA0wgmxK4zw3ZIg%3A1703227153004
//	&source=hp
//	&ei=EC-FZaWiO8Gs-QbRrajwDg
//	&iflsig=AO6bgOgAAAAAZYU9IeoU0AmpHS8LxqsaregibTbaZpNs
	
	//?key=value&key2=value2&key3=value3,....
	@GetMapping(path = "query-param01")  // http://localhost:8080/api/get/query-param01?name=yuna&email=aa@encore.or.kr&age=22
	public String queryParam01(
			@RequestParam String name, 
			@RequestParam String email, 
			@RequestParam String age) {
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(age);
		
		return name+", "+email+", " + age;
				
	}
	
//	http://localhost:8080/api/get/query-param02?user=kang&email=bb@encore.or.kr&age=33&address=busan&tt=jeju
	//?key=value&key2=value2&key3=value3,....
	@GetMapping(path = "query-param02")  // http://localhost:8080/api/get/query-param02?user=kang&email=bb@encore.or.kr&age=33
	public String queryParam02(@RequestParam Map<String, String> queryParam) {
		
		StringBuilder sb = new StringBuilder();
		
		queryParam.entrySet().forEach( entry -> {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
			sb.append(entry.getKey()+"=" + entry.getValue());
		} );
		
//		for(Map.Entry<String, String> entry : queryParam.entrySet() ) {
//			System.out.println(entry.getKey());
//			System.out.println(entry.getValue());
//			
//			sb.append(entry.getKey()+"=" + entry.getValue());
//		}
		
		return sb.toString();
	}
	
	//?key=value&key2=value2&key3=value3,....
	@GetMapping(path = "query-param03")    // http://localhost:8080/api/get/query-param03?user=kang&email=bb@encore.or.kr&age=33
	public String queryParam03(UserDto dto) { // 객체 타입으로 리턴할때는 @RequestParam 안쓴다. 권장하는 방식
		
		System.out.println(dto.getName());
		System.out.println(dto.getAge());
		System.out.println(dto.getEmail());
		
		return dto.toString();
	}
	
}






