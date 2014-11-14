package demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestRecommendController {

    private static final String template = "recommend!, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/recommend")
    public Greeting recommend(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                            String.format(template, name));
    }
}