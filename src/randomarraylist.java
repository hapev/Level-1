import java.util.ArrayList;
import java.util.Random;

public class randomarraylist {
	Random random = new Random();

	ArrayList<Integer> numList = new ArrayList<Integer>();

	public static void main(String[] args) {
		randomarraylist r = new randomarraylist();
		r.setup();

	}

	public void setup() {
		int gabriel = 100;
		for (int john = 0; john < gabriel; john++) {
			numList.add(random.nextInt(9));
			for (int r = 0; r < john; r++) {
				System.out.print(numList.get(r));

			}
			System.out.println(numList.get(john));

		}
	}

}