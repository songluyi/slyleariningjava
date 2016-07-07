/**
 * Created by sly on 2016/7/5.
 * Connect me by slysly759@gmail.com
 */
public class Emp {
    // 这个成员变量对子类可见
    public String name;
    // 私有变量，仅在该类可见
    private double salary;
    //在构造器中对name赋值
    public Emp (String empName){
        name = empName;
    }
    //设定salary的值
    public void setSalary(double empSal){
        salary = empSal;
    }
    // 打印信息
    public void printEmp(){
        System.out.println("name  : " + name );
        System.out.println("salary :" + salary);
    }

    public static void main(String args[]){
        Emp empOne = new Emp("Ransika");
        empOne.setSalary(1000);
        empOne.printEmp();
    }
}
