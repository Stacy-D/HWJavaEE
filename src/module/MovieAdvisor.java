package module;
import java.util.*;
/**
 * Created by Stacy on 7/15/15.
 */
public class MovieAdvisor {

    public List getMovies(String mood) {
        List movies = new ArrayList();
        if(mood.equals("depressing")){
            movies.add("Blue Valentine (2010)");
            movies.add("Short Term 12 (2013)");

        }
        else if(mood.equals("romantic")){
            movies.add("About Time (2013)");
            movies.add("Beginners (2010)");
            movies.add("Ruby Sparks (2012)");

        }
        else if(mood.equals("challenging")){
            movies.add("[ICYMI] Nightcrawler (2014)");
            movies.add("Mysterious Skin (2005)");
        }
        else{
            movies.add("Begin Again (2013)");
            movies.add("The Before Trilogy: Sunrise (1995), Sunset (2004), Midnight (2013)");

        }
        return movies;
    }
}
