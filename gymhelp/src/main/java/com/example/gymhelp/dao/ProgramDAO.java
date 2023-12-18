package com.example.gymhelp.dao;

import com.example.gymhelp.model.Program;

import java.util.List;
import java.util.UUID;

public interface ProgramDAO {

    int insertProgram(UUID id, Program p);

    default int insertProgram(Program p) {
        UUID id = UUID.randomUUID();
        return insertProgram(id, p);
    }

    List<Program> selectAllPrograms();
}
