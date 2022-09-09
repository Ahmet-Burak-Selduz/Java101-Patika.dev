public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax(){
        if (salary > 1000){
            return salary * 0.03;
        }
        return 1;
    }

    int bonus(){
        if (workHours > 40){
            return (workHours - 40) * 30;
        }
        return 0;
    }

    double riseSalary(){
        if (2021 - hireYear < 10){
            return salary * 0.05;
        } else if (2021 - hireYear < 20){
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    void toStrings(){
        System.out.println("Adı : " + name);
        System.out.println("Maaşı : " + salary);
        System.out.println("Çalışma Saati : " + workHours);
        System.out.println("Başlangıç Yılı : " + hireYear);
        System.out.println("Vergi : " + tax());
        System.out.println("Bonus : " + bonus());
        System.out.println("Maaş Artışı : " + riseSalary());
        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş : " + (salary + bonus() - tax()));
        System.out.println("Toplam Maaş : " + (salary + bonus() + riseSalary()));
        System.out.println("Net Maaş : " + (salary + bonus() + riseSalary() - tax()));
    }
}
