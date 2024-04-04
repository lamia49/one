package com.example.onetoone.DTO;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class porfileDTO {
    private Integer coustmoerId;
    @NotNull
    private Integer age;
    @NotEmpty
    private String email;
    @NotEmpty
    private String phoneNumbe;

}
