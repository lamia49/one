package com.example.onetoone.Service;

import com.example.onetoone.Api.ApiExepstion;
import com.example.onetoone.DTO.porfileDTO;
import com.example.onetoone.Model.Coustmer;
import com.example.onetoone.Model.Profil;
import com.example.onetoone.Rebositry.RebositryCoustmer;
import com.example.onetoone.Rebositry.RebositryProfil;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfilService {
    private  final RebositryCoustmer rebositryCoustmer;
    private  final  RebositryProfil rebositryProfil;

    public void add(porfileDTO porfileDTO){
        Coustmer coustmer= rebositryCoustmer.findCoustmerById(porfileDTO.getCoustmoerId());
        if(coustmer==null){
            throw  new ApiExepstion("id not found");
        }

        Profil profil=new Profil(null,porfileDTO.getEmail(),porfileDTO.getPhoneNumbe(),porfileDTO.getAge(),coustmer);
        rebositryProfil.save(profil);
    }
    public List<Profil> get(){
        return rebositryProfil.findAll();

    }

    public void update(porfileDTO porfileDTO){
        Profil profil=rebositryProfil.findProfilById(porfileDTO.getCoustmoerId());
        if(profil==null){
            throw  new ApiExepstion("id not found");
        }

        profil.setAge(porfileDTO.getAge());
        profil.setEmail(porfileDTO.getEmail());
        profil.setPhoneNumber(porfileDTO.getPhoneNumbe());
        rebositryProfil.save(profil);
    }

    public void delete(Integer id){
        Profil profil=rebositryProfil.findProfilById(id);
        if(profil==null){
            throw  new ApiExepstion("id not found");
        }
        rebositryProfil.delete(profil);
    }
}
