package com.example.gymhelp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Collection;
import java.util.UUID;

public class Program {
    private UUID id;
    private String title;
    private Collection<String> exercises;
    private String description;
    private String muscleGroup;

    private String duration;

    private String difficulty;

    public Program(@JsonProperty("id")
                   UUID id,
                   @JsonProperty("title")
                   String title,
                   @JsonProperty("exercises")
                   Collection<String> exercises,
                   @JsonProperty("description")
                   String description,
                   @JsonProperty("muscleGroup")
                   String muscleGroup,
                   @JsonProperty("duration")
                   String duration,
                   @JsonProperty("difficulty")
                   String difficulty) {
        this.id = id;
        this.title = title;
        this.exercises = exercises;
        this.description = description;
        this.muscleGroup = muscleGroup;
        this.duration = duration;
        this.difficulty = difficulty;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Collection<String> getExercises() {
        return exercises;
    }

    public void setExercises(Collection<String> exercises) {
        this.exercises = exercises;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMuscleGroup() {
        return muscleGroup;
    }

    public void setMuscleGroup(String muscleGroup) {
        this.muscleGroup = muscleGroup;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    @Override
    public String toString() {
        return "Program: " +
                "Title='" + title + "\n" +
                "Exercises=" + exercises +
                "Description='" + description + "\n" +
                "Muscle Group='" + muscleGroup + "\n" +
                "Duration='" + duration + "\n" +
                "Difficulty='" + difficulty;
    }
}
