package pl.writeonly.bootservices

import org.springframework.boot.SpringApplication

import org.springframework.boot.autoconfigure.EnableAutoConfiguration

import pl.writeonly.bootservices.domain.ConnectionService

@EnableAutoConfiguration
object BootApp extends App {
  SpringApplication.run(classOf[BootController]);
}
