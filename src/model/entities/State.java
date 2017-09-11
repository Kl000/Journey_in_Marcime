package model.entities;

public class State {
	private String actualState;
	public static final String[] LIST_STATE = {"alive", "dead", "poisoned", "stun", "root", "muted", "blinded", "weaked"};
	
	public State(String actualState) {
		this.setActualState(actualState);
	}
	
	public String getActualState() {
		return actualState;
	}
	
	public void setActualState(String state) {
		int i = 0;
		boolean isAValidState = false;
		while (!isAValidState && i < State.LIST_STATE.length) {
			isAValidState = state.equalsIgnoreCase(State.LIST_STATE[i]);
			i++;
		}
		if (isAValidState) {
			this.actualState = state;
		}
	}
}
