package br.com.homework.superheroes.api.dtos;

import br.com.homework.superheroes.api.dtos.requests.GuildDTO;
import br.com.homework.superheroes.repositories.entities.Guild;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GuildResponseDTO {

    public GuildDTO data;
}
