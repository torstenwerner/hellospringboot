package hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicInteger;

@Controller
public class HelloController {
    final AtomicInteger requestNumber = new AtomicInteger(0);

    @RequestMapping("/")
    @ResponseBody
    public String hello() {
        return "Hello from Spring Boot! Request number: " + requestNumber.getAndIncrement() +
                ". Source code is available at https://github.com/torstenwerner/hellospringboot .";
    }
}
