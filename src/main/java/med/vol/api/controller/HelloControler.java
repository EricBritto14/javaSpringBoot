@RestController
@RequestMapping("/hello")

public class HelloControler {

    @GetMapping
    public String olaMundo(){
        return "Hello world";
    }
    
}
