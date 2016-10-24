package pl.writeonly.scalaservices.crud

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import org.springframework.stereotype.Controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody


object AppController extends App {
  SpringApplication.run(classOf[AppController]);
}

@Controller
@EnableAutoConfiguration
class AppController {

    @RequestMapping(Array("crud/"))
    @ResponseBody
    def crud = "CRUD";
    
}