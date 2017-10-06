import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FavouriteAnimals {

  public static void main(String[] args) {
    // The program's aim is to collect your favourite animals and store them in a text file.
    // There is a given text file called '''favourites.txt''', it will contain the animals
    // If ran from the command line without arguments
    // It should print out the usage:
    // ```java FavouriteAnimals [animal] [animal]```
    // You can add as many command line arguments as many favourite you have.
    // One animal should be stored only at once
    // Each animal should be written in separate lines
    // The program should only save animals, no need to print them
    FavouriteAnimals fav = new FavouriteAnimals();

    if (args.length == 0) {
      fav.printUsage();
    } else if (args.length >= 1) {
      writeAnimals(args);
    }
  }


  public void printUsage() {
    System.out.println(" '''java FavouriteAnimals [animal] [animal] ''' ");
  }


  public static void writeAnimals(String[] args) {

    List<String> animal = Arrays.asList(args);
    try {
      Path myFile = Paths.get("favourites.txt");
      Files.write(myFile, animal, StandardOpenOption.APPEND);

      if (animal.contains(Arrays.asList(args))) {
        System.out.println("please, don't do this to me");

      } else {
        Files.write(myFile, animal, StandardOpenOption.APPEND);
      }
    } catch (
        IOException e) {
      System.out.println("I'm really sorry, I couldn't comprehend what you were talking about");
    }
  }

}




