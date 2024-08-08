import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        List<Movie> m1=Arrays.asList(new Movie("pushpa", "allu", 2021),new Movie("salar", "prbhas", 2024));
        Stream<Movie> s1=m1.stream();
        Stream<Movie> f1=s1.filter(m->m.getRyear()==2021);
        Stream<String> s2=f1.map(m->m.getMname());
        s2.forEach(System.out::println);
    }
    
}
