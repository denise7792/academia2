package net.bit;

public class Corso {
    protected int id;
    protected String title;
    protected String description;
    protected String syllabus;
    protected int area_id;
    protected int numHours;
    protected boolean level;
    protected double cost;
    protected int project_id;

    public int getid()
    {
        return id;
    }

    public void setid(int id)
    {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int are_id) {
        this.area_id = area_id;
    }

    public int getnumHours()
    { return numHours; }

    public void setNumHours() {this.numHours=numHours; }


}
