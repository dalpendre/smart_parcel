package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LogisticsOperator extends User
{
    @Id
    private Long id;

    private String company_name;
}
