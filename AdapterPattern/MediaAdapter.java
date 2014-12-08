package org.colin.adapterpattern;

/**
 * 媒体播放器适配器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 8, 2014
 */
public class MediaAdapter implements MediaPlayer {

	// 媒体播放器适配器持有一个具体播放器的接口
	AdvancedMediaPlayer advancedMediaPlayer;

	public MediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer = new VlcPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer = new Mp4Player();
		}
	}

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMediaPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
