package com.example.realestate.controller;

import com.example.realestate.service.AgentsService;
import org.springframework.web.bind.annotation.*;
import com.example.realestate.service.AgentsService;
import com.example.realestate.dto.AgentsDTO;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.List;
@RestController
@RequestMapping("/api/agents")
public class AgentsController {
    private final AgentsService agentsService;
    public AgentsController(AgentsService agentsService) {
        this.agentsService = agentsService;
    }
//    @GetMapping("")
//    public List<AgentsDTO> findAll() {
//        return agentsService.findAll();
//    }

    @GetMapping("/{id}")
    public AgentsDTO findById(@PathVariable long id) {
        return agentsService.findById(id);
    }
    @PostMapping
    public AgentsDTO createAgents(@RequestBody AgentsDTO agentsDTO) {
        return agentsService.create(agentsDTO);
    }
    @PutMapping("/{id}")
    public AgentsDTO updateAgents(@PathVariable long id, @RequestBody AgentsDTO agentsDTO) {
        return agentsService.update(id, agentsDTO);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        agentsService.delete(id);
    }
}
