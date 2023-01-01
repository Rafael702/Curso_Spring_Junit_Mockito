package br.com.dicasdeumdev.api.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {

    private Integer id;
    private String name;
    private String email;
    //@JsonIgnore -> ignora o campo. N escreve e nao le
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY )
    private String password;
}
