package ua.com.payments.lab2.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private Long accountId;
    private Double balance;
    private boolean isBlocked;


    public void replenish(double amount) {
        if (!isBlocked) {
            this.balance += amount;
        } else {
            throw new IllegalStateException("Акаунт заблоковано");
        }
    }


    public void makePayment(double amount) {
        if (!isBlocked && this.balance >= amount) {
            this.balance -= amount;
        } else if (isBlocked) {
            throw new IllegalStateException("Акаунт заблоковано");
        } else {
            throw new IllegalStateException("Недостатный баланс");
        }
    }


    public void blockAccount() {
        this.isBlocked = true;
    }
}
