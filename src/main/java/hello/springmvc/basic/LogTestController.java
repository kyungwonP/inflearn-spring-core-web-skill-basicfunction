package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";
        String name2 = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log =" + name); // 출력하지 않아도 연산이 일어남

        log.trace("trace log ={}{}", name, name2);
        log.debug("debug log ={}", name);
        log.info(" info log ={}", name);
        log.warn(" warn log ={}", name);
        log.error("error log ={}", name);

        return "ok";
    }
}
