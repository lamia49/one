package com.example.onetoone.Rebositry;

import com.example.onetoone.Model.Coustmer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RebositryCoustmer extends JpaRepository<Coustmer,Integer> {
    Coustmer findCoustmerById(Integer id);

}
