package com.example.onetoone.Controller;

import com.example.onetoone.Api.ApiResponse;
import com.example.onetoone.DTO.porfileDTO;
import com.example.onetoone.Model.Coustmer;
import com.example.onetoone.Model.Profil;
import com.example.onetoone.Service.ProfilService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/profil")
@AllArgsConstructor
public class ProfileController {
    private  final ProfilService profilService;
    @PostMapping("/add")
    public ResponseEntity add(@RequestBody @Valid porfileDTO p){
        profilService.add(p);
        return ResponseEntity.status(200).body("profile added");
    }

    @GetMapping("/get")
    public ResponseEntity get(){
        return ResponseEntity.status(200).body(profilService.get());
    }


    @PutMapping("/update")
    public ResponseEntity update(@RequestBody @Valid porfileDTO porfileDTO){
        profilService.update(porfileDTO);
        return ResponseEntity.status(200).body(new ApiResponse("updated"));
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        profilService.delete(id);
        return ResponseEntity.status(200).body(new ApiResponse("deleted"));
    }


}
