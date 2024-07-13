package com.sourav.productservicejune2024.InheritanceType.JoinedTable;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "jt_Mentors")
@PrimaryKeyJoinColumn(name = "User_id")
public class Mentor  extends Users {
    private String Company;
}
