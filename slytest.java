/**
 * Created by sly on 2016/7/5.
 * Connect me by slysly759@gmail.com
 */
public class slytest {
    public static void main(String args[]){
        sly empone=new sly("jack");
        sly emptwo=new sly("heiheihei");
        empone.empAge(26);
        empone.empDesignation("professional engineer");
        empone.empSalary(10000);
        empone.printEmployee();
        emptwo.empAge(21);
        emptwo.empDesignation("程序员鼓励师");
        emptwo.empSalary(500);
        emptwo.printEmployee();
    }
}
