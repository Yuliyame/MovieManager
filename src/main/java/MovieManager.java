public class MovieManager {
    private String[] movies = new String[0];

    public MovieManager() {

    }

    public MovieManager(int limit) {
        

    }
public void add (String movie) {
    String[] tmp = new String[movies.length + 1];
    for (int i = 0; i < movies.length; i++) {
        tmp[i] = movies[i];
    }
    tmp[tmp.length - 1] = movie;
    movies = tmp;
}

public String[] findAll() {
    return movies;

}

public String[] findLast() {
    int resultsLength;
    if (movies.length < 5) {
        resultsLength = movies.length;
    } else {
        resultsLength = 5;
    }
    String[] tmp = new String [resultsLength];
    for (int i = 0; i < tmp.length; i++) {
        tmp[i] = movies[movies.length -1 -i];
    }
    return tmp;

}
}
