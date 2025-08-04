public class GameMaster {

    public String describe(Character gameChar){
        return String.format("You're a level %s %s with %d hit points.", gameChar.getLevel(), gameChar.getCharacterClass(), gameChar.getHitPoints());
    }

    public String describe(Destination destination){
        return String.format("You've arrived at %s, which has %d inhabitants.", destination.getName(), destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod){
        String descriptionString;
        switch (travelMethod){
            case WALKING -> descriptionString = "You're traveling to your destination by walking.";
            case HORSEBACK -> descriptionString = "You're traveling to your destination on horseback.";
            default -> descriptionString = "";
        }
        return descriptionString;
    }

    public String describe(Character gameChar, Destination charDestination, TravelMethod travelMethod){
        return describe(gameChar) + " " + describe(travelMethod) + " " + describe(charDestination);
    }

    public String describe(Character gameChar, Destination destination){
        return describe(gameChar) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
