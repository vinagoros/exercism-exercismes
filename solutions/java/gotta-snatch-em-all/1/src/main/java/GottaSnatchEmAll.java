import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return Set.copyOf(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        int collectionLength = collection.size();
        collection.add(card);
        return collection.size() > collectionLength;
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !(myCollection.containsAll(theirCollection) || theirCollection.containsAll(myCollection)) ;
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonCards = new java.util.HashSet<>(Set.of());
        int nrOfSets = collections.size();
        Set<String> firstSet = collections.get(0); //it needs to be present in all sets, so we can use the first set as reference
        for (String element : firstSet) {
            boolean isCommon = true;
            for (int i = 1; i < nrOfSets; i++) {
                if (!collections.get(i).contains(element)){
                    isCommon = false;}
            }
            if (isCommon){
                commonCards.add(element);
            }
        }
        return commonCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> finalSet = new java.util.HashSet<>(Set.of());
        for (Set<String> collection : collections){
            finalSet.addAll(collection);
        }
        return finalSet;
    }
}
