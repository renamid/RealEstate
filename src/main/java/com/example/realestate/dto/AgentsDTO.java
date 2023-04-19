package com.example.realestate.dto;

import com.example.realestate.entity.Agents;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AgentsDTO {
    private Long id;
    private String name;
    private String email;
    private String phone;
    private Integer experience;
    private String education;
    private Float salary;

    public static AgentsDTO fromEntity(Agents agents) {
        AgentsDTO dto = new AgentsDTO();
        dto.setId(agents.getId());

        return dto;
    }

    public static Agents toEntity(AgentsDTO dto) {
        Agents agents = new Agents();
        agents.setId(dto.getId());

        return agents;
    }



}
