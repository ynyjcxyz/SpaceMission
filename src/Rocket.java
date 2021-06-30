public class Rocket implements SpaceShip {
  long cost;
  int weight;
  int maxWeight;
  double explosionFactor;
  double crashFactor;
  int cargoWeight = 0;


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
    return item.weight+cargoWeight <= maxWeight;
  }

  @Override
  public int carry(Item item) {
    cargoWeight += item.weight;
    return cargoWeight;
  }
}