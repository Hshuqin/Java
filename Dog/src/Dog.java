
public class Dog {
	DogState state;
	Dog(){
		
	}
	void show(){
	Host host = new Host();
	state=host;
	state.showState();
	Enemy enemy = new Enemy();
	state=enemy;
	state.showState();
	Friend friend = new Friend();
	state=friend;
	state.showState();
	Companion companion =new Companion();
	state=companion;
	state.showState();
	}
}
