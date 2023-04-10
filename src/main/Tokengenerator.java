package main;
import java.security.SecureRandom;

public class Tokengenerator {

public static void main(String[] args) {
    SecureRandom randomeNumer= new SecureRandom();
    int randomeNumber=randomeNumer.nextInt();
    System.out.println(randomeNumber);
    }
}
