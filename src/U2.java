public class U2 extends Rocket{
    U2 u2 = new U2();
    @Override
    public boolean launch(){
        u2.ExplosionFactor = 0.04;
        u2.SelfWeight = 18;
        u2.MaxWeight = 29;
        u2.CargoLimit = u2.MaxWeight - u2.SelfWeight;
        u2.CargoCarried = (int)(u2.CargoLimit * Math.random())+1;
        double ChanceOfLaunchExplosion = ExplosionFactor * (CargoCarried/CargoLimit);
        if(ChanceOfLaunchExplosion>0.5){
            return true;
        }
        else{
            return false;
        }
    }
    @Override
    public boolean land(){
        u2.CrashFactor = 0.08;
        u2.SelfWeight = 18;
        u2.MaxWeight = 29;
        u2.CargoLimit = u2.MaxWeight - u2.SelfWeight;
        u2.CargoCarried = (int)(u2.CargoLimit * Math.random())+1;
        double ChanceOfLandingExplosion = CrashFactor * (CargoCarried/CargoLimit);
        if(ChanceOfLandingExplosion>0.5){
            return true;
        }
        else{
            return false;
        }
    }
}
