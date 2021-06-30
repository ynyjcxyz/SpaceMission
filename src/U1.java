public class U1 extends Rocket{
    U1() {
        this.cost = 100000000;
        this.weight = 10;
        this.maxWeight = 18;
        this.explosionFactor = 0.05;
        this.crashFactor = 0.01;
    }

    @Override
    public boolean launch(){
        double chanceOfExplosion = this.explosionFactor * (this.cargoWeight/this.maxWeight);
        double chanceRandom = Math.random();
        return chanceOfExplosion < chanceRandom;
    }

    @Override
    public boolean land(){
        double chanceOfCrash = this.crashFactor * (this.cargoWeight/this.maxWeight);
        double chanceRandom = Math.random();
        return chanceOfCrash < chanceRandom;
    }
}