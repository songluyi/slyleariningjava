/**
 * Created by sly on 2016/7/5.
 * Connect me by slysly759@gmail.com
 */
public class sly {
    String name;
    int age;
    String designation;
    double salary;
    public sly(String name){
        this.name=name;
    }
//    这里还不算太明白
    public void empAge(int empAge){
        age=empAge;
    }
    public void empDesignation(String empDesig){
        designation=empDesig;
    }
    public void empSalary(double empSalary){
        salary = empSalary;
    }
    /* 打印信息 */
    public void printEmployee(){
        System.out.println("Name:"+ name );
        System.out.println("Age:" + age );
        System.out.println("Designation:" + designation );
        System.out.println("Salary:" + salary);
    }
}
