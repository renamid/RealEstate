package com.example.realestate.service;

import com.example.realestate.dto.AgentsDTO;
import com.example.realestate.entity.Agents;
import com.example.realestate.repository.AgentsRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AgentsService {

    private final AgentsRepository agentsRepository;

    public AgentsService(AgentsRepository agentsRepository) {
        this.agentsRepository = agentsRepository;
    }

    public AgentsDTO create(AgentsDTO dto) {
        Agents agents = new Agents();
        //создание агента по параметрам
        agents = agentsRepository.save(agents);

        return AgentsDTO.fromEntity(agents);
    }

    public AgentsDTO findById(Long id) {
        Agents agents = agentsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Agents not found with id:" + id));
        return AgentsDTO.fromEntity(agents);
    }

    public AgentsDTO update(Long id, AgentsDTO dto) {
        Agents agents = agentsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Agents not found with id:" + id));
        //внос новых данных agents.set***(dto.get***());

        agents = agentsRepository.save(agents);//save in BD

        return AgentsDTO.fromEntity(agents);
    }

    public void delete(Long id) {
        Agents agents = agentsRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Agents not found with id:" + id));
        agentsRepository.delete(agents);
    }

    //далее нужно прописать телефону, имени фамилии,
    //после нужно создать добавление, обновление и удаление связных объектов
}
