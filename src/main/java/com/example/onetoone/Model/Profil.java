package com.example.onetoone.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Profil {
    @Id
    private Integer id;
    @Column(columnDefinition = "varchar(20)")
    private String email;
    @Column(columnDefinition = "varchar(20)")
    private String phoneNumber;
    @Column(columnDefinition = "int(20)")
    private Integer age;

    @OneToOne
    @MapsId
    @JsonIgnore
    private Coustmer coustmer;
}
