package info.futureme.abs.example.entity.g;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit. 
/**
 * Entity mapped to table "project".
 */
public class Project {

    private Long id;
    private Integer projectid;
    private String name;
    private Integer status;
    private String description;
    private String itsmcode;

    public Project() {
    }

    public Project(Long id) {
        this.id = id;
    }

    public Project(Long id, Integer projectid, String name, Integer status, String description, String itsmcode) {
        this.id = id;
        this.projectid = projectid;
        this.name = name;
        this.status = status;
        this.description = description;
        this.itsmcode = itsmcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getProjectid() {
        return projectid;
    }

    public void setProjectid(Integer projectid) {
        this.projectid = projectid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItsmcode() {
        return itsmcode;
    }

    public void setItsmcode(String itsmcode) {
        this.itsmcode = itsmcode;
    }

}
