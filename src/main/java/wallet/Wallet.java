package wallet;

import org.springframework.stereotype.Service;

public class Wallet {

    private Double balance = 0.0;

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Wallet() {
    }

    public Wallet(Double balance) {
        this.balance = balance;
    }
}
