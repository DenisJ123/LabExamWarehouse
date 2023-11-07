package ie.atu.examwarehouse;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/warehouse")
    public String warehouse()
    {
        return "Capacity = 50 units";
    }
}
