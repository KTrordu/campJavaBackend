package system.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class ApprovedEmployer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @Column(name = "validation_id")
    private int validation_id;
    
    @Column(name = "is_system_approved")
    private boolean is_system_aprooved;
    
    @Column(name = "is_email_approved")
    private boolean is_email_approved;
    
    @Column(name = "validation_email")
    private String validation_email;
}
