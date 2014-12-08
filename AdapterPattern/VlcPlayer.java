package org.colin.adapterpattern;

/**
 * Vlc格式媒体播放器
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 8, 2014
 */
public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. FileName:" + fileName);
	}

	@Override
	public void playMp4(String fileName) {
		// 什么也不做
	}

}
