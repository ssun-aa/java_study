
public interface Meter {
	
	void start();
	void stop(int distance);
	
	public default void afterMidnight() {
		System.out.println("������ �Ѿ����ϴ�. ������ �ʿ��� ��� �� �޼��带 �������̵� �ϼ���.");
		
	}
}

