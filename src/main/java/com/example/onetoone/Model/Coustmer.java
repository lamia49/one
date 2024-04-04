package com.example.onetoone.Model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Coustmer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "varchar(20)")
    private String name;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "coustmer")  //Working: merge and DETACH and REFRESH...Not working:All,PERSIST
    @PrimaryKeyJoinColumn
    private Profil profil;
}
