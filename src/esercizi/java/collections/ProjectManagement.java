package collections;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

class Project{

    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private Set<Task> tasks;
    public Project(String name, LocalDate startDate, LocalDate endDate){
        this.name = name;
        this.startDate = startDate;
        this.endDate=endDate;
        this.tasks = new HashSet<>();
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void addTask(Task task){
        tasks.add(task);
        if(task.getProject() != this){
            task.setProject(this);
        }
    }
    public void removeTask(Task task){
        tasks.remove(task);
        task.setProject(null);
    }

    public Set<Task> getTasks() {
        return tasks;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj.getClass() != getClass()){
            return false;
        }
        return (
                Objects.equals(this.name, ((Project) obj).name) &&
                this.startDate == ((Project)obj).startDate &&
                this.endDate == ((Project)obj).endDate
        );

    }

    @Override
    public int hashCode() {
        return Objects.hash(name,startDate,endDate);
    }

    @Override
    public String toString() {
        return "nome: " + this.name + " startDate: " + startDate + " endDate: " + endDate;
    }
}

class Task{
    private final UUID uuid;
    private String descripton;
    private Integer hoursNeeded;

    Project project;
    Employee TeamLeader;

    public Task(String descripton, Integer hoursNeeded) {
        this.uuid = UUID.randomUUID();
        this.descripton = descripton;
        this.hoursNeeded = hoursNeeded;
    }

    public Integer getHoursNeeded() {
        return hoursNeeded;
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public void setHoursNeeded(Integer hoursNeeded) {
        this.hoursNeeded = hoursNeeded;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        if(Objects.nonNull(this.project) && (this.project.getTasks().contains(this))){
            this.project.removeTask(this);
        }
        if(Objects.nonNull(project)){
            project.getTasks().add(this);
        }
        this.project = project;

    }

    public Employee getTeamLeader() {
        return TeamLeader;
    }

    public void setTeamLeader(Employee teamLeader) {
        TeamLeader = teamLeader;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(uuid, task.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }


    @Override
    public String toString() {
        return "uuid: " + uuid + " description: " + descripton + " hoursNeeded: " + hoursNeeded;
    }
}

class Employee {
    private String name;
    private String lastname;
    private String socialSecurityCode;
    
     public Employee(String name, String lastname, String socialSecurityCode){
         this.name = name;
         this.lastname = lastname;
         this.socialSecurityCode = socialSecurityCode;
     }


    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSocialSecurityCode() {
        return socialSecurityCode;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSocialSecurityCode(String socialSecurityCode) {
        this.socialSecurityCode = socialSecurityCode;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this){
            return true;
        }
        if(obj.getClass() != getClass()){
            return false;
        }
        return (
                Objects.equals(this.name, ((Employee) obj).name) &&
                        this.lastname.equals(((Employee) obj).lastname) &&
                        Objects.equals(this.socialSecurityCode, ((Employee) obj).socialSecurityCode)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,lastname,socialSecurityCode);
    }

    @Override
    public String toString() {
        return "name: " + name + " lastname: " + lastname + " socialSecurityCode: " + socialSecurityCode;
    }
}