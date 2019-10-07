
package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Turma implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int turma_id;
    private String codigo;
    private String sala;
    @ManyToOne (cascade = CascadeType.ALL)
    private Disciplina disciplina_id;
    @ManyToOne (cascade = CascadeType.ALL)
    private Professor professor_id;

    public int getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(int turma_id) {
        this.turma_id = turma_id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public Disciplina getDisciplina_id() {
        return disciplina_id;
    }

    public void setDisciplina_id(Disciplina disciplina_id) {
        this.disciplina_id = disciplina_id;
    }

    public Professor getProfessor_id() {
        return professor_id;
    }

    public void setProfessor_id(Professor professor_id) {
        this.professor_id = professor_id;
    }

}
