
public class LockedState implements State {
	SubwayStation subway;
	public LockedState(SubwayStation s) {
		subway = s;
	}

	@Override
	public void insertCoin() {
		System.out.println("Coin inserted");
		subway.setState(subway.unlockedState);
	}

	@Override
	public void pass() {
		System.out.println("You shall not pass!");
		signalAlarm();
	}

	private void signalAlarm() {
		System.out.println("WeeWooWeeWooWeeWooEHHHHHHHHHHHH");
	}


}
