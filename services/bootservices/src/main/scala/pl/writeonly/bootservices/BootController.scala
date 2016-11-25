package pl.writeonly.bootservices

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestMapping


@Controller
class BootController {
  
    @RequestMapping(Array("/"))
    @ResponseBody
    def home(): String = "Hello World!";
    
}