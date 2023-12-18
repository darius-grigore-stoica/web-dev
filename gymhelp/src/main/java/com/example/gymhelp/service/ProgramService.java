package com.example.gymhelp.service;

import com.example.gymhelp.dao.ProgramDAO;
import com.example.gymhelp.model.Program;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProgramService {

    private final ProgramDAO programDAO;

    @Autowired
    public ProgramService(@Qualifier("fakeDAO") ProgramDAO programDAO) {
        this.programDAO = programDAO;
    }

    public int addProgram(Program p) {
        return programDAO.insertProgram(p);
    }

    public List<Program> getAllPrograms() {
        return programDAO.selectAllPrograms();
    }
}
