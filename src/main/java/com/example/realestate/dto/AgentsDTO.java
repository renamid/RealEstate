package com.example.realestate.dto;

import com.example.realestate.entity.Agents;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class AgentsDTO {
    private long id;
    private String name;
    private String email;
    private String phone;
    private int experience;
    private String education;
    private float salary;

    public static AgentsDTO fromEntity(Agents agents) {
        AgentsDTO dto = new AgentsDTO();
        dto.setId(agents.getId());
        dto.setName(agents.getName());

        return dto;
    }

    public static Agents toEntity(AgentsDTO dto) {
        Agents agents = new Agents();
        agents.setId(dto.getId());

        return agents;
    }



}
