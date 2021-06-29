public class U2 extends Rocket{
    U2 u2 = new U2();
    @Override
    public boolean launch(){
        u2.explosionFactor = 0.04;
        u2.selfWeight = 18;
        u2.maxWeight = 29;
        u2.cargoLimit = u2.maxWeight - u2.selfWeight;
        u2.cargoCarried = (int)(u2.cargoLimit * Math.random())+1;
        double chanceOfLaunchExplosion = explosionFactor * (cargoCarried / cargoLimit);
        return chanceOfLaunchExplosion > 0.5;
    }
    @Override
    public boolean land(){
        u2.crashFactor = 0.08;
        u2.selfWeight = 18;
        u2.maxWeight = 29;
        u2.cargoLimit = u2.maxWeight - u2.selfWeight;
        u2.cargoCarried = (int)(u2.cargoLimit * Math.random())+1;
        double chanceOfLandingExplosion = crashFactor * (cargoCarried / cargoLimit);
        return chanceOfLandingExplosion > 0.5;
    }
}
