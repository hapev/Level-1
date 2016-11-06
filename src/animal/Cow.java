package animal;

public class Cow {

	
int numberOfSpots;
String favoriteTypeOfGrass;
String cowName;
public Cow(int numberOfSpots, String favoriteTypeOfGrass, String cowName) {
	this.numberOfSpots = numberOfSpots;
	this.favoriteTypeOfGrass = favoriteTypeOfGrass;
	this.cowName = cowName;
}
void moo(){
System.out.println("MOO!");	
}
void eat(){
	System.out.println(cowName+ " eats "+favoriteTypeOfGrass+" grass.");
}
}
