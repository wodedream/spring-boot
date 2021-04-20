package tt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tt.beans.Car;

/*@ResponseBody
@Controller*/
@RestController
public class HelloController {
    @Autowired
    Car car;

    @RequestMapping("/car")
    public Car car(){
        return  car;
    }
    @RequestMapping("/hello")
    public String handle01() {
        return "Hello spring boot";
    }
    @RequestMapping("/h")
    public String handle02() {
        return "Hello baba";
    }

}
