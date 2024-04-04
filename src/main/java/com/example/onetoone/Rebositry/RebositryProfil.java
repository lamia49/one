package com.example.onetoone.Rebositry;

import com.example.onetoone.Model.Profil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebositryProfil extends JpaRepository<Profil,Integer> {
    Profil findProfilById(Integer id);
}
