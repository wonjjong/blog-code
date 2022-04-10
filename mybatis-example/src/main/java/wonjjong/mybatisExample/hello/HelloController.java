package wonjjong.mybatisExample.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/adk/index")
public class HelloController {

    @GetMapping("/test")
    public String index() {
        System.out.println("test requestMapping invoke");
        return "test";
    }
}
