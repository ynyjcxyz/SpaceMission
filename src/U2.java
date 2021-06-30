public class U2 extends Rocket {
    U2() {
        this.cost = 120000000;
        this.weight = 18;
        this.maxWeight = 29;
        this.explosionFactor = 0.04;
        this.crashFactor = 0.08;
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
