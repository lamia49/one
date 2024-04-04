package com.example.onetoone.Service;

import com.example.onetoone.Api.ApiExepstion;
import com.example.onetoone.Model.Coustmer;
import com.example.onetoone.Rebositry.RebositryCoustmer;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CoustmerService {
    private final RebositryCoustmer rebositryCoustmer;

    public List<Coustmer>getCoustmer(){
      return rebositryCoustmer.findAll();
    }

    public void add(Coustmer coustmer){
        rebositryCoustmer.save(coustmer);
    }

    public void update(Integer id,Coustmer coustmer){
        Coustmer coustmer1=rebositryCoustmer.findCoustmerById(id);
        if(coustmer1==null){
            throw  new ApiExepstion("id not found");
        }
        coustmer1.setName(coustmer.getName());
        rebositryCoustmer.save(coustmer1);
    }

    public void delete(Integer id){
        Coustmer coustmer1=rebositryCoustmer.findCoustmerById(id);
        if(coustmer1==null){
            throw  new ApiExepstion("id not found");
        }
        rebositryCoustmer.delete(coustmer1);
    }


}
