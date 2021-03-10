
public class main extends player {

	public static void main(String[] args) {
		

		main Main = new main();
		Main.play("Hello");
		Main.pause();
		Main.play("Hello");
		Main.stop();
	}

	@Override
	void play(String title) {
		System.out.println(title + "is playing now");
		
	}

	@Override
	void pause() {
		System.out.println("Pause the music");
		
	}

	@Override
	void stop() {
		System.out.println("Stop the music");
		
	}

}
