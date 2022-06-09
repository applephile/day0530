package day0530;

class MyTv {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	private int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	//문제
	//MyTv클래스의 멤버변수 isPowerOn, channel, volume은
	//클래스 외부에서 접근할 수 없음
	//이 멤버 변수들의 값을 어디서나 읽고 변경할 수 있도록
	//getter, setter 메서드 추가
	//매개변수가 있는 메서드는 반드시 작업 전에 남겨받은 값의
	//유효성 검사 실시
	
	//이전 채널로 이동하는 기능의 메서드 추가
	//반환타입, 매개변수 없음
	
	public boolean getIsPowerOn() {
		return this.isPowerOn;
	}
	
	public void setIsPowerOn() {
		isPowerOn = !isPowerOn;
	}
	
	public int getChannel() {
		return channel;
	}
	
	public void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) {
			return;
		}
		prevChannel = this.channel;
		this.channel = channel;
	}
	
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) {
			return;
		}
		this.volume = volume;
	}
	
	public void gotoPrevChannel() {
		setChannel(prevChannel);
	}
	
	
}

public class TvMain {

	public static void main(String[] args) {
		
		MyTv m = new MyTv();
		
		m.setIsPowerOn();
		System.out.println(m.getIsPowerOn());
		
		m.setChannel(1);
		System.out.println("channel : " + m.getChannel());
		
		m.setVolume(32);
		System.out.println("volume : " + m.getVolume());
		
		m.setChannel(10);
		System.out.println("channel : " + m.getChannel());
		
		m.gotoPrevChannel();
		System.out.println("channel : " + m.getChannel());
		
		
	}

}
