
public class UnlockedState implements State {

	SubwayStation subway;

	public UnlockedState(SubwayStation s) {
		subway = s;
	}

	@Override
	public void insertCoin() {
		System.out.println("It is already unlocked");
		turnOnLight();
	}

	@Override
	public void pass() {
		System.out.println("Welcome to the Subway");
		subway.setState(subway.lockedState);
	}

	private void turnOnLight() {
		System.out.println("Thank You Light Activated");
	}

}
