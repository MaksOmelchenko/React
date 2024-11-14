package ua.com.payments.lab2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import ua.com.payments.lab2.entity.Account;
import ua.com.payments.lab2.entity.Сlient;

import java.util.Arrays;
import java.util.List;

@RestController
public class PaymentController {

    @GetMapping("/test-clients")
    public Flux<Сlient> getClients() {
        // Створення акаунтів для кожного клієнта
        Account account1 = new Account(1L, 1000.0, false);
        Account account2 = new Account(2L, 1500.0, false);
        Account account3 = new Account(3L, 2000.0, true);

        // Створення клієнтів з акаунтами

        return Flux.just(
                        new Сlient(1L, "Oleg", "Vinnil", Arrays.asList(account1, account2)),
                        new Сlient(2L, "Iva", "Pypkina", List.of(account3)),
                        new Сlient(3L, "Inna", "Pypkina", Arrays.asList(account1, account3))
                )
                .skip(0)
                .take(2);
    }
}
