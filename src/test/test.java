package test;

public class test {
	//�ڹ�7 ����
	public void method1(final int arg) {
		final int localVariable = 1;
		//arg = 100;	//�Ұ���
		//localVariable = 100 //�Ұ���
		class Inner {
			public void method( ) {
				int result = arg + localVariable;
			} 
		}
	}


	//�ڹ�8 ����
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;	//�Ұ���
		//localVariable = 100;//�Ұ���
		class Inner {
			public void method( ) {
				int result = arg + localVariable;
			} 
		}
	}
}