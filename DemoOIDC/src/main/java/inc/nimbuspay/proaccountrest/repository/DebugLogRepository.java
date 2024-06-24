package inc.nimbuspay.proaccountrest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import inc.nimbuspay.proaccountrest.entity.DebugLog;

@Repository
public interface DebugLogRepository extends JpaRepository<DebugLog, Integer> {

}
