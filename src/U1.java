public class U1 extends Rocket{
    U1 u1 = new U1();

    @Override
    public boolean launch(){
        u1.explosionFactor = 0.05;
        u1.selfWeight = 10;
        u1.maxWeight = 18;
        u1.cargoLimit = u1.maxWeight - u1.selfWeight;
        u1.cargoCarried = (int)(u1.cargoLimit * Math.random())+1;
        double chanceOfLaunchExplosion = explosionFactor * (cargoCarried / cargoLimit);
        return chanceOfLaunchExplosion > 0.5;
    }
    @Override
    public boolean land(){
        u1.crashFactor = 0.01;
        u1.selfWeight = 10;
        u1.maxWeight = 18;
        u1.cargoLimit = u1.maxWeight - u1.selfWeight;
        u1.cargoCarried = (int)(u1.cargoLimit * Math.random())+1;
        double chanceOfLandingExplosion = crashFactor * (cargoCarried / cargoLimit);
        return chanceOfLandingExplosion > 0.5;
    }
}