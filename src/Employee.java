public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;

    }
    public static int tax(int taxOfSalary){
        if (taxOfSalary<1000){
            return 0;
        }else{

            return 3;
        }
    }
    public static int bonus(int workOfHours) {
        if (workOfHours > 40) {
            return (workOfHours - 40 )* 30;
        }
        else{
            return 0;
        }
    }
    public static double raiseSalary(int hireYear){
        if (2024 - hireYear<10){
            return  5;
        } else if (hireYear>9 && hireYear<20) {
            return 10;
        } else  {
            return 15;
        }

    }
    double vergiBonusVeMaas;
    double vergi;
    double maasArtis;
    double topMaas;

public void print(){
   maasArtis= 0.01*raiseSalary(hireYear)*salary;
   vergi=0.01*tax(salary)*salary;
   vergiBonusVeMaas=salary-vergi+bonus(workHours);
   topMaas=vergiBonusVeMaas+maasArtis;
    System.out.println("Adı: "+this.name);
    System.out.println("Maaşı: "+this.salary);
    System.out.println("Çalışma saati: "+this.workHours);
    System.out.println("Başlangıç yılı: "+this.hireYear);
    System.out.println("Vergi: "+vergi);
    System.out.println("Bonus: "+bonus(workHours));
    System.out.println("Maaş artışı :"+maasArtis);
    System.out.println("Vergi ve Bonuslar ile birlikte maaş :"+vergiBonusVeMaas);
    System.out.println("Toplam Maaş :"+topMaas);
}

    public static void main(String[] args) {
        Employee calisanlar=new Employee("Kemal",2000,45,1985);
     calisanlar.print();

    }


    }


