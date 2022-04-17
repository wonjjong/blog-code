package wonjjong.mybatisExample.hello;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/adk/index")
@Slf4j
public class HelloController {

    @GetMapping("/test")
    public String index(HttpServletRequest request) {
        log.info("username= {}",request.getParameter("username"));
        log.info("certNm= {}", request.getParameter("certNm"));
        return "test";
    }
    @PostMapping("/test")
    public void post(HttpServletRequest request) {
        log.info("username= {}",request.getParameter("username"));
        log.info("certNm= {}", request.getParameter("certNm"));
        log.info("cc = {}", request.getParameter("cc"));
        log.info("jumin = {}", request.getParameter("jumin"));

    }
}
