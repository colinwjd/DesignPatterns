package org.colin.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();

		audioPlayer.play("mp3", "testSong.mp3");
		audioPlayer.play("mp4", "nice.mp4");
		audioPlayer.play("vlc", "hello.vlc");
		audioPlayer.play("avi", "world.avi");
	}

}
