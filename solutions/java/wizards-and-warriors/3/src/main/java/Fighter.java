class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }


}

class Warrior extends Fighter{

    @Override
    public String toString(){
        return "Fighter is a " + getClass().getSimpleName();
    }

    @Override
    boolean isVulnerable(){return false;}


    @Override
    int getDamagePoints(Fighter fighter){
        if (fighter.isVulnerable()) {
            return 10;
        }
        else {
            return 6;
        }
    }
}

class Wizard extends Fighter{
    boolean spellPrepared = false;

    @Override
    public String toString(){
        return "Fighter is a " + getClass().getSimpleName();
    }

    @Override
    boolean isVulnerable(){
        return !spellPrepared;
    }

    void prepareSpell(){
        spellPrepared = true;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return spellPrepared ? 12 : 3;
    }

}

class Tests {
    public static void main(String[] args) {
        Warrior warrior = new Warrior();
        System.out.println(warrior.toString());
    }
}