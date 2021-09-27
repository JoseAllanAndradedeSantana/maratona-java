package jdbc;

import java.util.Objects;

public class Procuder {
    private Integer id;
    private String name;

    public Procuder( String name) {

        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Procuder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Procuder procuder = (Procuder) o;
        return Objects.equals(id, procuder.id) && Objects.equals(name, procuder.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
