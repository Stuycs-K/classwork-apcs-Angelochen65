public class Reaper extends Adventurer{
  private int souls, maxSouls;
  public Reaper(String name){
      super(name);
  }

  public Reaper(String name, int hp, int souls){
      super(name, hp);
      this.souls = souls;
      this.maxSouls = souls;

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
    return "souls";
  }
  //accessor methods
  public int getSpecial(){
    return this.souls;
  }
  public void setSpecial(int n){
    souls = n;
  }
  public int getSpecialMax(){
    return maxSouls;
  }

  /*
    all adventurers must have a way to attack enemies and
    support their allys
  */
  //hurt or hinder the target adventurer
  public  String attack(Adventurer other){
    other.applyDamage(5);
    return "Ouchies! " + other.getName() + " HP now at " + other.getHP();
  }

  //heall or buff the target adventurer
  public  String support(Adventurer other){
    other.setHP(other.getHP()+ 5);
    return "Hooray! " + other.getName() + " HP now at " + other.getHP();
  }

  //heall or buff self
  public  String support(){
    setHP(this.getHP() + 5);
    return "Woah! Hp now at " + this.getHP();
  }

  //hurt or hinder the target adventurer, consume some special resource
  public  String specialAttack(Adventurer other){
    other.applyDamage(5 + 2*souls);
    souls -= 1;
    return "Ouchies! " + other.getName() + " HP now at " + other.getHP() + " souls: " + this.getSpecial();
  }
}
