package com.wavesplatform.we.app.example.contract

import com.wavesplatform.vst.contract.spring.annotation.EnableContractHandlers
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
@EnableContractHandlers
class ExampleContractStarter

fun main() {
    SpringApplication.run(ExampleContractStarter::class.java)
}