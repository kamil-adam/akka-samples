package pl.writeonly.scalaservices.boot

import org.springframework.boot.SpringApplication

import pl.writeonly.scalaservices.boot.domain.ConnectionService

object BootApp extends App {
  SpringApplication.run(classOf[ConnectionService]);
}
