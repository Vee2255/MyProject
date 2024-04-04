
package school;

import java.util.Objects;


public class Student {
    private int id;
    private String name;
    private EduLevel level;
    private Gender sex;

    public Student(int id, String name, EduLevel level, Gender sex) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EduLevel getLevel() {
        return level;
    }

    public void setLevel(EduLevel level) {
        this.level = level;
    }

    public Gender getSex() {
        return sex;
    }

    public void setSex(Gender sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", level=" + level + ", sex=" + sex + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.id;
        hash = 41 * hash + Objects.hashCode(this.name);
        hash = 41 * hash + Objects.hashCode(this.level);
        hash = 41 * hash + Objects.hashCode(this.sex);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.level, other.level)) {
            return false;
        }
        return this.sex == other.sex;
    }

  
    
    
}
