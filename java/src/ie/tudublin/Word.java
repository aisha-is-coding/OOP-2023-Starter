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
    
}
