package ua.com.payments.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Сlient {
    private Long id;
    private String firstName;
    private String lastName;
    private List<Account> accounts;
}
