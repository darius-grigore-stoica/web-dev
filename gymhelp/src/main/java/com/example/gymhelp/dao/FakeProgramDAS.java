package com.example.gymhelp.dao;

import com.example.gymhelp.model.Program;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("fakeDAO")
public class FakeProgramDAS implements ProgramDAO{
    private static List<Program> db = new ArrayList<>();
    @Override
    public int insertProgram(UUID id, Program p) {
        db.add(new Program(id, p.getTitle(), p.getExercises(), p.getDescription(), p.getMuscleGroup(), p.getDuration(), p.getDifficulty()));
        return 1;
    }

    @Override
    public List<Program> selectAllPrograms() {
        return db;
    }

}
