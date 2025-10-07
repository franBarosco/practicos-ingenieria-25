public class DomesticDuck extends Duck{

    public DomesticDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display(){
        System.out.println("I'm a very nice domestic Duck!");
    }

    
}
