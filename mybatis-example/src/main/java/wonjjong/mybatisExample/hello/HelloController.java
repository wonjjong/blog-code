package wonjjong.mybatisExample.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/adk/index")
public class HelloController {

    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "index";
    }
}
