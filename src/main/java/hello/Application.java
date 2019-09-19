package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.micrometer.core.annotation.Timed;

@SpringBootApplication
@RestController
@Timed
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
    
    @GetMapping("/test")
    public String test() {
    	return "Second route";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
