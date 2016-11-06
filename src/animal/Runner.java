package animal;

public class Runner {
public static void main(String[] args) {
	Cow johnston = new Cow(25,"blue", "Johnston"); 
	johnston.eat();
	johnston.moo();
	Cow gabriel = new Cow(178,"bleached", "Gabriel");
	gabriel.eat();
	gabriel.moo();
	Cow phil = new Cow(1234567890,"blue", "Phil");
	phil.eat();
	phil.moo();

}
}
