import edu.princeton.cs.algs4.*;
public class RandomWord {

    public static void main(String[] args) {
      String champion = null;
      int count = 0;
  
      // Read words from standard input until there are no more
      while (!StdIn.isEmpty()) {
        count++;
        String word = StdIn.readString();
  
        // Use StdRandom.bernoulli(1.0 / count) to decide if this word becomes champion
        if (StdRandom.bernoulli(1.0 / count)) {
          champion = word;
        }
      }
  
      // Print the surviving champion
      if (champion != null) {
        StdOut.println(champion);
      } else {
        System.out.println("No words were read from standard input.");
      }
    }
  }