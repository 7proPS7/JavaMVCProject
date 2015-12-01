/*First version of MVC Java Project => pablos7 */

package pablos.example.com;

import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		MyView myView = new MyView();

		Calculate calc = new Calculate();

		MyController controller = new MyController(myView, calc);
		controller.displayMessageAlfa();
		controller.setFirstValue(in.nextInt());
		controller.displayMessageBeta();
		controller.setSecondValue(in.nextInt());
		// controller.getAddResult();
		// controller.getIloResult();
		controller.displayAddView();
		System.out.println("\n");
		controller.displayIloView();

	}

}
