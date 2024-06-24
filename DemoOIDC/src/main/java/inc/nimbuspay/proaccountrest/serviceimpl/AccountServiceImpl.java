package inc.nimbuspay.proaccountrest.serviceimpl;

import org.springframework.stereotype.Service;

import inc.nimbuspay.proaccountrest.repository.AccountRepository;
import inc.nimbuspay.proaccountrest.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public String readAccountRecord() {
        return "dummy";
    }

}
