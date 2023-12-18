package com.example.gymhelp.api;

import com.example.gymhelp.model.Program;
import com.example.gymhelp.service.ProgramService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/v1/program")
@RestController
public class ProgramController {

    private final ProgramService programService;

    @Autowired
    public ProgramController(ProgramService programService) {
        this.programService = programService;
    }

    @PostMapping
    public void addProgram(@RequestBody Program p) {
        programService.addProgram(p);
    }

    @GetMapping
    public List<Program> getAllPrograms() {
        return programService.getAllPrograms();
    }
}
