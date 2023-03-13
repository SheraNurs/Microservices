package org.example.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(
        scanBasePackages = {
                "org.example.notification",
                "org.example.amqp",
        }
)
public class NotificationApplication {

    public NotificationApplication(NotificationRepository notificationRepository) {
    }

    public static void main(String[] args) {
        SpringApplication.run(NotificationApplication.class, args);
    }

}
