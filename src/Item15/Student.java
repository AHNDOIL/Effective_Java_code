package Item15;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {

    String name; //접근 제한자를 명시하지 않으면 pakage-private
    String id;
    Score score;
    private static final Double[] STANDARD = {4.5, 4.0, 3.5, 3.0, 2.5};

    public static final List<Double> VALUES =
            Collections.unmodifiableList(Arrays.asList(STANDARD));

    public static final Double[] values(){
        return STANDARD.clone();
    }



    private static class Score{
        double major_score;
        double general_score;
        double total_score;
    }

    public static void main(String[] args){
        Student A = new Student();
        A.score.major_score = 4.5;
    }
}


