package wallet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/money")
public class WalletController {

    @Autowired
    private WalletService walletService;

    @RequestMapping("/balance")
    public Double showBalance() {
        return walletService.showMoney();
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/add")
    public void addMoney(@RequestBody Double addedMoney) {
       walletService.addMoney(addedMoney);
    }

    @RequestMapping(method=RequestMethod.PUT, value = "/take")
    public void takeMoney(@RequestBody Double sum) {
        walletService.takeMoney(sum);
    }
}
