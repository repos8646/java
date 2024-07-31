package sub8;

public class Cable implements Socket {

	private Bulb bulb;
	
	// 생성자 선언
	public Cable(Bulb bulb) {
		this.bulb = bulb;
	}
	
	
	@Override
	public void switchOn() {
		bulb.lightOn();
	}

	@Override
	public void switchOff() {
		bulb.lightOff();
	}
	
}
