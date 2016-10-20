package pl.writeonly.scalaservices.crud

object AppController extends App {
  SpringApplication.run(SampleController.class, args);
}

@Controller
@EnableAutoConfiguration
class AppController {

    @RequestMapping("/")
    @ResponseBody
    def home = "Hello World!";
    

    public static void main(String[] args) throws Exception {
     
    }
}