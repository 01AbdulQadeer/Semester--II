package lab8.task1;
abstract class Game{
    abstract void  play();
}
class chess extends Game{
    void play(){
        System.out.println("We play Game");
    }
}
class checker extends Game{
    void play(){
        System.out.println("Ypu win the Game");
    }
}
public class task3 {
    public static void main(String[] args) {
        chess obj1=new chess();
        checker obj2=new checker();
        obj1.play();
        obj2.play();
    }
}
