

public class SubwayStation {
	private State state;
	public UnlockedState unlockedState;
	public LockedState lockedState;

	public SubwayStation() {
		unlockedState = new UnlockedState(this);
		lockedState = new LockedState(this);
		state = lockedState;
	}

	public void setState(State s) {
		state = s;
	}
	
	public State getState(){
		return state;
	}
	
	public void pass(){
		state.pass();
	}
	
	public void insertCoin(){
		state.insertCoin();
	}

}
