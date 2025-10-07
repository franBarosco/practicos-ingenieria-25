import org.junit.jupiter.api.Test;

public class TestDuck {

    @Test
    public void testMallardDuck() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();
    }

    @Test
    public void testModelDuck() {
        Duck model = new ModelDuck();
        model.performQuack();
        model.performFly();
    }

    @Test
    public void testModelDuckChangeFlyBehavior() {
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }

    @Test
    public void testDomesticDuck() {
        Duck domestic = new DomesticDuck();
        domestic.performFly();
        domestic.performQuack();
    }

    @Test
    public void testMallardDuckChangeQuackBehavior() {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.setQuackBehavior(new QuackLouder());
        mallard.performQuack();
    }

}
