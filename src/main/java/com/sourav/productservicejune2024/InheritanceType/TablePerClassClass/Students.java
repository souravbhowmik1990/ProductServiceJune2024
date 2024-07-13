package com.sourav.productservicejune2024.InheritanceType.TablePerClassClass;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "TPC_Student")
public class Students extends User {
    private String Batch;

}
