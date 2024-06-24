package inc.nimbuspay.proaccountrest.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "Account")
@Data
public class Account {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "UUID")
    private UUID accountId;

    @Column(nullable = false, unique = true)
    private int accountNumber;

    @Column(length = 26)
    private String accountType;

    @Column(length = 3)
    private String iso4217Currency;

    @Column(columnDefinition = "INT DEFAULT 0")
    private int ledgerBalance;

    @Column(columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", insertable = false, updatable = false, name = "Timestamp")
    private LocalDateTime timestamp;
}
