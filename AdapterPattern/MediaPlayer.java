package org.colin.adapterpattern;

/**
 * 媒体播放器接口
 * 
 * @author Colin{wjd.colin@gmail.com}
 * @date Dec 8, 2014
 */
public interface MediaPlayer {
	/**
	 * 播放
	 * 
	 * @param audioType
	 *            要播放的媒体文件格式
	 * @param fileName
	 *            要播放的媒体文件名
	 */
	public void play(String audioType, String fileName);
}
