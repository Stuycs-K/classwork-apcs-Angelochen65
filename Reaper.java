public class Reaper extends Adventurer{
  public Reaper(String name){
      super(name);
  }

  public Reaper(String name, int hp){
      super(name, hp);
  }

  //concrete method written using abstract methods.
  //refill special resource by amount, but only up to at most getSpecialMax()
  public int restoreSpecial(int n){
      if( n > getSpecialMax() - getSpecial()){
              n = getSpecialMax() - getSpecial();
      }
      setSpecial(getSpecial()+n);
      return n;
  }

  //Abstract methods are meant to be implemented in child classes.

  /*
    all adventurers must have a custom special
    consumable resource (mana/rage/money/witts etc)
  */
  //give it a short name (fewer than 13 characters)
  public String getSpecialName(){
    return "Tornado Slice"
  }
  //accessor methods
  public int getSpecial();
  public void setSpecial(int n);
  public int getSpecialMax();

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public  String attack(Adventurer other);

  //heall or buff the target adventurer
  public  String support(Adventurer other);

  //heall or buff self
  public  String support();

  //hurt or hinder the target adventurer, consume some special resource
  public  String specialAttack(Adventurer other);
}
