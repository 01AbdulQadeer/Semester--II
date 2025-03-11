package lab8.task1;
abstract class Animal{
    abstract void makesound();
    static void display(){
            System.out.println("display inside Animal");
    }
    
}
class dog extends Animal{
    @Override
    void makesound(){
        System.out.println("wao  wao wao");
    }
}
class cat extends Animal{
    @Override
    void makesound(){
        System.out.println("meo meo meo");
    }
}
public class task2 {
    public static void main(String[] args) {
        dog obj1=new dog();
        cat obj2=new cat();
        obj1.makesound();
        obj2.makesound();
    }
    
}
