package hello.hellospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")    // /hello라고 들어오면 이 메서드를 호출해줌
    public String hello(Model model) {  //모델, 뷰, 컨트롤러 중에 그 모델
        model.addAttribute("data", "hello!!");
        //키는 데이터 값은 헬로우
        return "hello"; //resouces에 있는 templates에 있는 hello에 가서 렌더링 해라
    }
    /*컨트롤러에서 리턴 값으로 문자를 반환하면 뷰 리졸버(`viewResolver`)가 화면을 찾아서 처리
        스프링 부트 템플릿엔진 기본 viewName 매핑
        `resources:templates/` + {ViewName} + `/html` */

}
