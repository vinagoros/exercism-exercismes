class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }


    // VERSION WITH TO STRING OVERRIDE AT FIGHTER CLASS LEVEL - THIS IS NOT ACCEPTED BUT IT SURE WORKS

    @Override
    public String toString(){
        return "Fighter is a " + this.getClass().getSimpleName();
    }
}

class Warrior extends Fighter{


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