import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {

    @Id
    private int empId;
    @Column(name = "emp_name")
    private String name;


    @ManyToMany
    @JoinTable
            (
                    name = "emp_learn",
                    joinColumns = {@JoinColumn(name = "eid")},
                    inverseJoinColumns = {@JoinColumn(name = "pid")}
            )
    List<Projects> projects = new ArrayList<>();

    public List<Projects> getProjects() {
        return projects;
    }

    public void setProjects(List<Projects> projects) {
        this.projects = projects;
    }

    public Employee(int empId, String name) {
        super();
        this.empId = empId;
        this.name = name;
    }

    public Employee() {
        super();
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
