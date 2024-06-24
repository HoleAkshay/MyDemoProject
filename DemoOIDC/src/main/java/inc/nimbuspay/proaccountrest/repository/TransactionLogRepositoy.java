package inc.nimbuspay.proaccountrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inc.nimbuspay.proaccountrest.entity.TransactionLog;

@Repository
public interface TransactionLogRepositoy extends JpaRepository<TransactionLog, Integer> {

}
