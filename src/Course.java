//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.note = 0;
    }


    void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
            this.courseTeacher = courseTeacher;
        }
    }
}


