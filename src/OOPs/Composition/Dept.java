package OOPs.Composition;


public class Dept {
    private String name;
    private long deptCode;
    private Professor hod;  

    // Constructor
    public Dept(String name, long deptCode, Professor hod) {
        this.name = name;
        this.deptCode = deptCode;
        this.hod = hod;
    }

    // Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(long deptCode) {
        this.deptCode = deptCode;
    }

    public Professor getHod() {
        return hod;
    }

    public void setHod(Professor hod) {
        this.hod = hod;
    }


}
