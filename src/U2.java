public class U2 extends Rocket {
    U2() {
        cost = 120;
        weight = 18000;
        maxWeight = 29000;
        launchExplosion  = 0.00;
        landingCrash  = 0.00;
        currentWeight = weight;
    }

    @Override
    public boolean launch(){
        int random = (int)(Math.random()*100 +1);
        this.launchExplosion = 4.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <= random;
    }

    @Override
    public boolean land(){
        int random = (int)(Math.random()*100 +1);
        this.launchExplosion = 8.0 * (this.currentWeight - this.weight) / (this.maxWeight - this.weight);
        return this.launchExplosion <= random;
    }
}
