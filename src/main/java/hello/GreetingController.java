//package hello;
//
//import java.util.concurrent.atomic.AtomicLong;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class GreetingController {
//
//    private static final String template = "Hello, %s!";
//    private final AtomicLong counter = new AtomicLong();
//
//    @RequestMapping("/hello-world")
//    @ResponseBody
//    public Greeting sayHello(@RequestParam(value="name", required = false, defaultValue="Stranger") String name) {
//        return new Greeting(counter.incrementAndGet(),
//                String.format(template, name));
//    }
//}