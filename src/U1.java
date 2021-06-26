public class U1 extends Rocket{
    U1 u1 = new U1();
    @Override
    public boolean launch(){
        u1.ExplosionFactor = 0.05;
        u1.SelfWeight = 10;
        u1.MaxWeight = 18;
        u1.CargoLimit = u1.MaxWeight - u1.SelfWeight;
        u1.CargoCarried = (int)(u1.CargoLimit * Math.random())+1;
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
        u1.CrashFactor = 0.01;
        u1.SelfWeight = 10;
        u1.MaxWeight = 18;
        u1.CargoLimit = u1.MaxWeight - u1.SelfWeight;
        u1.CargoCarried = (int)(u1.CargoLimit * Math.random())+1;
        double ChanceOfLandingExplosion = CrashFactor * (CargoCarried/CargoLimit);
        if(ChanceOfLandingExplosion>0.5){
            return true;
        }
        else{
            return false;
        }
    }
}