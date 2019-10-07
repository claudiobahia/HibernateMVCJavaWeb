package model;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Nota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nota_id;
    private float av1;
    private float av2;
    @ManyToOne(cascade = CascadeType.ALL)
    private Aluno aluno_id;
    @ManyToOne(cascade = CascadeType.ALL)
    private Turma turma_id;

    public int getNota_id() {
        return nota_id;
    }

    public void setNota_id(int nota_id) {
        this.nota_id = nota_id;
    }

    public float getAv1() {
        return av1;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public float getAv2() {
        return av2;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public Aluno getAluno_id() {
        return aluno_id;
    }

    public void setAluno_id(Aluno aluno_id) {
        this.aluno_id = aluno_id;
    }

    public Turma getTurma_id() {
        return turma_id;
    }

    public void setTurma_id(Turma turma_id) {
        this.turma_id = turma_id;
    }
}
