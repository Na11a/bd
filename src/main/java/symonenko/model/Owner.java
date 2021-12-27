package symonenko.model;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "owner", schema = "symonenko", catalog = "")
public class Owner {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic
    @Column(name = "name", nullable = false, length = 45)
    private String name;
    @Basic
    @Column(name = "surname", nullable = false, length = 45)
    private String surname;
    @Basic
    @Column(name = "age", nullable = true, length = 45)
    private String age;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "owner_has_stantion", catalog = "", schema = "symonenko", joinColumns = @JoinColumn(name = "owner_id", referencedColumnName = "id", nullable = false), inverseJoinColumns = @JoinColumn(name = "station_id", referencedColumnName = "id", nullable = false))
    private List<Station> stantions;

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owner owner = (Owner) o;
        return Objects.equals(id, owner.id) && Objects.equals(name, owner.name) && Objects.equals(surname, owner.surname) && Objects.equals(age, owner.age);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, age);
    }

    public List<Station> getStantions() {
        return stantions;
    }

    public void setStantions(List<Station> stantions) {
        this.stantions = stantions;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
