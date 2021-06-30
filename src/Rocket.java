public class Rocket implements SpaceShip {
  int cost;
  int launchTime;
  int selfWeight;
  int maxWeight;
  int cargoLimit = maxWeight - selfWeight;
  int cargoCarried;
  double explosionFactor;
  double crashFactor;
  double chanceOfLaunchExplosion = explosionFactor * (cargoCarried / cargoLimit);
  double chanceOfLandingExplosion = crashFactor * (cargoCarried / cargoLimit);


  @Override
  public boolean launch() {
    return true;
  }

  @Override
  public boolean land() {
    return true;
  }

  @Override
  public boolean canCarry(Item item) {
    return item.weight < cargoLimit;
  }

  @Override
  public int carry(Item item) {
    int currentWeight = selfWeight + item.weight;
    return currentWeight;
  }
}