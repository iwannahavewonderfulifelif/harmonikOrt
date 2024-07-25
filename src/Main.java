public class Main {
    public static void main(String[] args) {
        Teacher t1=new Teacher("Ayşe Hoca","999","FZK");
        Teacher t2=new Teacher("Marie Curie","000","KMY");
        Teacher t3=new Teacher("Asu Karadere","888","MAT");
        Course fizik=new Course("Fizik","101","FZK");
        Course kimya =new Course("Kimya","102","KMY");
        Course matematik=new Course("Matematik","103","MAT");
        fizik.addTeacher(t1);
        kimya.addTeacher(t2);
        matematik.addTeacher(t3);

        Student s1=new Student("İnek Şaban","0001","5",fizik,matematik,kimya);
        s1.addBulkExamNote(100,200,50);
        s1.isPass();

        Student s2=new Student("Güdük Necmi","555","8",fizik,kimya,matematik);
        s2.addBulkExamNote(98,90,100);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "444" ,"2" ,matematik, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();
    }
}
