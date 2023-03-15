package org.example.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;


@SpringBootApplication(
        scanBasePackages = {
                "org.example.notification",
                "org.example.amqp",
        }
)
@PropertySources({
        @PropertySource("classpath:clients-${spring.profiles.active}.properties")
})
public class NotificationApplication {

    public NotificationApplication(NotificationRepository notificationRepository) {
    }

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

}
