package pl.writeonly.scalaservices.boot

import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import pl.writeonly.scalaservices.boot.domain.ConnectionService

@EnableAutoConfiguration
object BootApp extends App {
  SpringApplication.run(classOf[BootController]);
}
