package hello.springmvc.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogTestController {

    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    public String testLog() {
        String test = "test";

//        log.trace("log trace test = " + test); -> 절대 사용 금지(쓸데없는 자원 사용한다..속도저하)

        log.trace("log trace test = {}", test);
        log.debug("log debug test = {}", test);
        log.info("log info test = {}", test);
        log.warn("log warn test = {}", test);
        log.error("log error test = {}", test);

        return "ok";
    }
}