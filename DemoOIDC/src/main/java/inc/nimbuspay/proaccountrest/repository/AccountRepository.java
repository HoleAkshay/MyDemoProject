package inc.nimbuspay.proaccountrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
import inc.nimbuspay.proaccountrest.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, UUID> {

}
