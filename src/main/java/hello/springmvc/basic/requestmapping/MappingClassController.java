package hello.springmvc.basic.requestmapping;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/mapping/users")
@RestController
public class MappingClassController {

    @GetMapping("")
    public String readUsers() {
        return "get users";
    }

    @PostMapping("")
    public String createUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String readUser(@PathVariable(name = "userId") String userId) {
        return "get userId : " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId : " + userId;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId : " + userId;
    }
}
