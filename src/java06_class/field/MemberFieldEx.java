package java06_class.field;

public class MemberFieldEx {
	public static void main(String[] args) {
		
		MemberField_01 mf01 = new MemberField_01();
		
		MemberField_01 mf02 = new MemberField_01();
		
		MemberField_01 mf03 = null;
		
		// ** null Ű����(��, ��) - ������ �������� �⺻��
		// 	-> ������ ����� ������ ǥ���Ѵ�
		
		mf02.setNum(777);
		System.out.println( mf01.getNum() );
		System.out.println( mf02.getNum() );
		
		//���� �߻� - NullPointerException
//		System.out.println( mf03.getNum() );
//		System.out.ptintln( mf03.getNum() );
		// -> NullPointerExcrption
		// -> null���� .���������ڸ� ����� ��Ȳ
		
	}
}
