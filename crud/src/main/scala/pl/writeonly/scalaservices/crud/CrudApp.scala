package pl.writeonly.scalaservices.crud

import org.springframework.boot.SpringApplication

import pl.writeonly.scalaservices.crud.controllers._

object CrudApp extends App {
  SpringApplication.run(classOf[CrudController]);
}
