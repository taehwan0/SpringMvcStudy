package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); // 생성하면서 현재 클래스 주입 @Slf4j 와 동일

    @GetMapping("/log-test")
    public String logTesT() {
        String name = "Spring";

        System.out.println("name = " + name);

        log.trace("trace log={}", name);
        log.debug("trace log={}", name);
        log.info("info log={}", name);
        log.warn("trace log={}", name);
        log.error("trace log={}", name);


        return "OK";
    }

    @GetMapping("/mapping-get")
    public String mappingGet() {
        log.info("mapping-get");
        return "OK";
    }

    @GetMapping("/mapping/{userId}")
    public String mappingPath(@PathVariable(name = "userId") String userId) {
        log.info("mappingPath userId={}", userId);
        return "OK";
    }
}
