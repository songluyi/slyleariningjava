/**
 * Created by sly on 2016/7/4.
 * Connect me by slysly759@gmail.com
 * this is to learn function and data transfer
 */


public class Puppy{
    int puppyAge;
    public Puppy(String name){
        System.out.print("passed Name is :"+name+"\n");
    }
    public void setAge(int age){
        puppyAge=age;
    }
    public int getAge(){
        System.out.print("Puppy's age is :"+puppyAge+"\n");
        return puppyAge;
    }
    public static void main(String []args){
         Puppy myPupy=new Puppy("sly");
        myPupy.setAge(2);
        myPupy.getAge();
        System.out.print("have fun "+myPupy.puppyAge+"\n");
     }

}