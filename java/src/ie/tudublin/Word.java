package ie.tudublin;

import java.util.ArrayList;

public class Word {
    
    String word;
    ArrayList<Follow> follows;

    public Word(String word) {
        this.word = word;
        this.follows = new ArrayList<Follow>();
    }

    public ArrayList<Follow> getFollows() {
        return follows;
    }

    public void addFollow(String followWord) {
        for (Follow follow : follows) {
            if (follow.getWord().equals(followWord)) {
                follow.incrementCount();
                return;
            }
        }
        // i need to call the follow class for this to work
        follows.add(new Follow(followWord));
    }
}
