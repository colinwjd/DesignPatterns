package org.colin.adapterpattern;

/**
 * 媒体播放器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 8, 2014
 */
public class AudioPlayer implements MediaPlayer {

	// 具体的媒体播放器持有一个媒体适配器
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {

		// 该具体播放器本身可以播放mp3文件
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing mp3 file. Filename:" + fileName);
		} else if (audioType.equalsIgnoreCase("mp4")
				|| audioType.equalsIgnoreCase("vlc")) {
			// 如果该播放器需要适配器，新建一个适配器
			mediaAdapter = new MediaAdapter(audioType);
			// 通过适配器播放该格式的媒体文件
			mediaAdapter.play(audioType, fileName);
		} else {
			// 如果通过适配器也不能播放该文件，打印出错信息
			System.out.println("Audio format:" + audioType + " not support.");
		}
	}

}
