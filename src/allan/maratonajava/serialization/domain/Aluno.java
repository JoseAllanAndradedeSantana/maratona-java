package allan.maratonajava.serialization.domain;

import java.io.Serializable;
import java.util.Objects;

public class Aluno implements Serializable {

    private long id;
    private String name;
    private String password;

    public Aluno(){

    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return id == aluno.id && Objects.equals(name, aluno.name) && Objects.equals(password, aluno.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password);
    }

    public Aluno(long id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
