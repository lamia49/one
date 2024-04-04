package com.example.onetoone.Controller;

import com.example.onetoone.Model.Coustmer;
import com.example.onetoone.Service.CoustmerService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/coustmer")
public class CoustmerController {
    private  final CoustmerService coustmerService;



    @GetMapping("/get")
    public ResponseEntity get(){
        return ResponseEntity.status(200).body(coustmerService);
    }



    @PostMapping("/add")
    public ResponseEntity add(@RequestBody @Valid Coustmer coustmer){
        coustmerService.add(coustmer);
        return ResponseEntity.status(200).body("added");
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @RequestBody @Valid Coustmer coustmer){
        coustmerService.update(id,coustmer);
        return ResponseEntity.status(200).body("updated");
    }

@DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        coustmerService.delete(id);
        return ResponseEntity.status(200).body("deleted");
    }


}
