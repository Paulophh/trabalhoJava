package br.grupointegrado.educacional.dto;

import jakarta.validation.constraints.NotNull;

public class MatriculaRequestDTO {

    @NotNull(message = "O codigo do aluno é preciso")
    private Integer alunoId;

    @NotNull(message = "O codigo da turma é preciso")
    private Integer turmaId;

    // Getters e Setters
    public Integer getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(Integer alunoId) {
        this.alunoId = alunoId;
    }

    public Integer getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Integer turmaId) {
        this.turmaId = turmaId;
    }
}
