package org.colin.adapterpattern;

/**
 * Mp4格式媒体播放器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 8, 2014
 */
public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		// 什么也不做
	}

	@Override
	public void playMp4(String fileName) {
		System.out.println("Playing mp4 file. Filename:" + fileName);
	}

}
