package bank_mini_pertemuan_11_starter.src.id.ac.polinema;

import java.util.Collection;

public interface AccountRepository {
    void save(Account account);

    Account findByNumber(String accountNumber);

    Collection<Account> findAll();
}
