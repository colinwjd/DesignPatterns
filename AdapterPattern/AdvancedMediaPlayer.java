package org.colin.adapterpattern;

/**
 * 高级媒体播放器接口
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 8, 2014
 */
public interface AdvancedMediaPlayer {
	/**
	 * 播放Vlc格式的媒体文件
	 * 
	 * @param fileName
	 *            媒体文件名
	 */
	public void playVlc(String fileName);

	/**
	 * 播放Mp4格式的媒体文件
	 * 
	 * @param fileName
	 *            媒体文件名
	 */
	public void playMp4(String fileName);
}
