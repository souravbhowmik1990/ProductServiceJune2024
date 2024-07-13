package com.sourav.productservicejune2024.InheritanceType.TablePerClassClass;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TPC_Instructor")
public class Instructor extends User {
    private String Subject;

}
