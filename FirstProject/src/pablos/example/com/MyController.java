package pablos.example.com;

public class MyController {
	private MyView myView;
	private Calculate calc;

	public MyController(MyView myView, Calculate calc) {
		this.myView = myView;
		this.calc = calc;
	}

	public void setFirstValue(int a) {
		calc.setAlfa(a);
	}

	public void setSecondValue(int b) {
		calc.setBeta(b);
	}

	public int getAddResult() {
		return calc.getAddValues();
	}

	public int getIloResult() {
		return calc.getIloValues();
	}

	public void displayAddView() {
		myView.display(calc.getAddValues());
	}

	public void displayIloView() {
		myView.display(calc.getIloValues());
	}

	public void displayMessageAlfa() {
		myView.showEnterAlfa();
	}

	public void displayMessageBeta() {
		myView.showEnterBeta();
	}
}
