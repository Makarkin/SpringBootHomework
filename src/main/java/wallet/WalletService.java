package wallet;

import org.springframework.stereotype.Service;

@Service
public class WalletService {

    private Wallet wallet = new Wallet(0.0);

    public Double showMoney() {
        return wallet.getBalance();
    }

    public void addMoney(Double money) {
        Double newMoney = wallet.getBalance() + money;
        wallet.setBalance(newMoney);
    }

    public Double takeMoney(Double sum) {
        Double balance = wallet.getBalance();
        if ( balance - sum > 0) {
            wallet.setBalance(balance - sum);
            return sum;
        }

        return 0.0;
    }

}
