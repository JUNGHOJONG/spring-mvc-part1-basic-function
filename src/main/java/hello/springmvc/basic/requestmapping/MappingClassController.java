package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequestMapping("/mapping/users")
@RestController
public class MappingClassController {

    /**
     * 회원 목록 조회
     */
    @GetMapping
    public String users() {
        log.info("check users");
        return "ok";
    }

    /**
     * 회원 등록
     */
    @PostMapping
    public String saveUser() {
        log.info("check save");
        return "ok";
    }

    /**
     * 회원 조회(단건)
     */
    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        log.info("check user={}", userId);
        return "ok";
    }

    /**
     * 회원 수정
     */
    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        log.info("check update={}", userId);
        return "ok";
    }

    /**
     * 회원 삭제
     */
    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        log.info("check delete={}", userId);
        return "ok";
    }
}
