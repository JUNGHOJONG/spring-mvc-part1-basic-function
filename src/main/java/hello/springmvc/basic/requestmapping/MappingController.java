package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MappingController {

    /**
     * PathVariable 사용
     * 변수명이 같으면 생략 가능
     * @PathVariable("userId") String userId -> @PathVariable String userId
     */
    @GetMapping("/mapping-get-method/{userId}")
    public String helloBasic(@PathVariable String userId) {
        log.info("log info={}", userId);
        return "ok";
    }

    /**
     * PathVariable 사용 - 다중
     */
    @GetMapping("/mapping/users/{userId}/orders/{orderId}")
    public String multiPathVariable(@PathVariable String userId, @PathVariable String orderId) {
        log.info("log userId={}, log orderId={}", userId, orderId);
        return "ok";
    }

    /**
     * 특정 파라미터 조건 매핑
     */
    @GetMapping(value = "/mapping-param", params = {"mode=debug", "data=good"})
    public String mappingParam() {
        log.info("mappingParam");
        return "ok";
    }

    /**
     * 특정 헤더 조건 매핑
     */
    @GetMapping(value = "/mapping-header", headers = "mode=debug")
    public String mappingHeader() {
        log.info("mappingHeader");
        return "ok";
    }

    /**
     * 미디어 타입 조건 매핑(Content-Type 헤더 기반 추가 매핑 Media Type)
     */
    @GetMapping(value = "/mapping-consume", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String mappingConsumes() {
        log.info("mappingConsumes");
        return "ok";
    }

    /**
     * 미디어 타입 조건 매핑 - HTTP 요청 Accept, produce
     */
    @GetMapping(value = "/mapping-produce", produces = MediaType.TEXT_HTML_VALUE)
    public String mappingProduces() {
        log.info("mappingProduces");
        return "ok";
    }


}