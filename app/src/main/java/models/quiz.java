package models;

import java.util.HashMap;
import java.util.Map;

public class quiz {

    private String quiztitle;
    private int quizicon;


    // Constructor
    public quiz(String quiztitle, int quizicon) {
        this.quiztitle = quiztitle;

        this.quizicon = quizicon;

    }

    // Getter and Setter
    public String getQuiztitle() {
        return quiztitle;
    }

    public void setQuiztitle(String quiztitle) {
        this.quiztitle = quiztitle;
    }


    public int getQuizicon() {
        return quizicon;
    }

    public void setQuizicon(int quizicon) {
        this.quizicon = quizicon;
    }
}