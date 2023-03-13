package org.example.clients.notification;

public record NotificationRequest(Integer toCustomerId, String ToCustomerEmail, String message) {
}
