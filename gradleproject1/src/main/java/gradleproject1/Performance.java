/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradleproject1;

/**
 *
 * @author Èãîð¸ê
 */
public class Performance {
    int Id_Studena , mark, Group;
    String Student, Fam, Name, Department, discipline, NameTecher;

    public Performance(int Id_Studena, String Fam, String Name, int Group, String Department, String discipline) {
        this.Id_Studena = Id_Studena;
        this.Fam = Fam;
        this.Name = Name;
        this.Group = Group;
        this.Department = Department;
        this.discipline = discipline;
    }

    public int getId_Studena() {
        return Id_Studena;
    }

    public int getMark() {
        return mark;
    }

    public String getStudent() {
        return Student;
    }

    public String getFam() {
        return Fam;
    }

    public String getName() {
        return Name;
    }

    public int getGroup() {
        return Group;
    }

    public String getDepartment() {
        return Department;
    }

    public String getDiscipline() {
        return discipline;
    }

    public String getNameTecher() {
        return NameTecher;
    }

    @Override
    public String toString() {
        return "Performance{" + "Id_Studena=" + Id_Studena + ", mark=" + mark + ", Student=" + Student + ", Fam=" + Fam + ", Name=" + Name + ", Group=" + Group + ", Department=" + Department + ", discipline=" + discipline + ", NameTecher=" + NameTecher + '}';
    }
    
    
}
