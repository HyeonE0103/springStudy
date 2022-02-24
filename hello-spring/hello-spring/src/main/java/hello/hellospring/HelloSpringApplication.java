package hello.hellospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	//자기가 띄우면서, 톰캣이라는 웹서버를 내장하고 있기 때문에 자체적으로 띄우면서 스프링부트가 같이 올라옴
public class HelloSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloSpringApplication.class, args);
	}

}
