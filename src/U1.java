public class U1 extends Rocket{


    @Override
    public boolean launch(){
        this.explosionFactor = 0.05;
        this.selfWeight = 10;
        this.maxWeight = 18;
        this.cargoLimit = this.maxWeight - this.selfWeight;
        this.cargoCarried = (int)(this.cargoLimit * Math.random())+1;
        double chanceOfLaunchExplosion = explosionFactor * (cargoCarried / cargoLimit);
        return chanceOfLaunchExplosion > 0.5;
    }
    @Override
    public boolean land(){
        this.crashFactor = 0.01;
        this.selfWeight = 10;
        this.maxWeight = 18;
        this.cargoLimit = this.maxWeight - this.selfWeight;
        this.cargoCarried = (int)(this.cargoLimit * Math.random())+1;
        double chanceOfLandingExplosion = crashFactor * (cargoCarried / cargoLimit);
        return chanceOfLandingExplosion > 0.5;
    }
}