package ie.tudublin;

import java.util.ArrayList;

public class Follow {
    
    String word; 
    int count; 

    // class constructor
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }

    // getters and setters;
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    

}
