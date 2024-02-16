package exercises.week1.facade.interfaces;

public interface Services {
  public int getAssetAmount(String userId);

  public void buy(String userId, int amount);
}
