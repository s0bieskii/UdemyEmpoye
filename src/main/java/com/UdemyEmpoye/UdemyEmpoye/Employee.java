package com.UdemyEmpoye.UdemyEmpoye;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int ID;
    private String first_name;
    private String last_name;
    private String company;

    public Employee(String first_name, String last_name, String company) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.company = company;
    }
}
