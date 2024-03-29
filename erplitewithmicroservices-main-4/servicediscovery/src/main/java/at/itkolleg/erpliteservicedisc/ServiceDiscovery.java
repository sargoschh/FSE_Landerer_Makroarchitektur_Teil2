package at.itkolleg.erpliteservicedisc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
@EnableEurekaServer
public class ServiceDiscovery {

    public static void main(String[] args) {
        SpringApplication.run(ServiceDiscovery.class, args);
    }

}
