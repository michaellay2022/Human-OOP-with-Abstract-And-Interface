

public interface Movement {

	abstract void waves();
	abstract void movesForward();
	
	public default void walks() {
		System.out.println("The animal walks about the room");
	}
	
	
}