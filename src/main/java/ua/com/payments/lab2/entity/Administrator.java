package ua.com.payments.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Administrator {
    private Long adminId;
    private String name;

    public void unblockAccount(Account account) {
        account.setBlocked(false);
    }
}
