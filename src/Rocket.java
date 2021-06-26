interface SpaceShip{
    public boolean launch();
    public boolean land();
    public boolean canCarry(Object Item);
    public int carry(Object Item);
}
public class Rocket implements SpaceShip{
    int cost;
    int LaunchTime;
    int SelfWeight;
    int MaxWeight;
    int CargoLimit = MaxWeight - SelfWeight;
    int CargoCarried;
    double ExplosionFactor;
    double CrashFactor;
    double ChanceOfLaunchExplosion = ExplosionFactor * (CargoCarried/CargoLimit);
    double ChanceOfLandingExplosion = CrashFactor * (CargoCarried/CargoLimit);


    @Override
    public boolean launch(){
        return true;
    }

    @Override
    public boolean land() {
        return true;
    }

    @Override
    public boolean canCarry(Object Item) {
        Item item = new Item();
        if(item.weight < CargoLimit){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public int carry(Object Item) {
        Item item = new Item();
        int CurrentWeight = SelfWeight + item.weight;
        return CurrentWeight;
    }
}