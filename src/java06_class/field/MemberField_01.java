package java06_class.field;

public class MemberField_01 {
	
	//��� �ʵ�
	private int num = 999;
	private String name = "Alice";
	
	

	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		
	System.out.println();
	System.out.println("---- Ŭ���� ���� �׽�Ʈ ----");
	
	MemberField_02 mf04 = new MemberField_02();		//������ ������ ������ �ڵ尡 ����ǰ� ���� ���� ������
	MemberField_02 mf05 = new MemberField_02();
	
	System.out.println( mf04.city );
	System.out.println( mf05.city );
	
	mf04.city = "Busan";
	
	System.out.println(">> Busan ���� �� ");
	System.out.println( mf04.city );
	System.out.println( mf05.city );
	
	MemberField_02.city = "Incheon";	//Ŭ������ ��� �ʵ� ����
	System.out.println( MemberField_02.city );
	
	// **Ŭ���� ������ ����� �� ��ü ������ �ƴ� Ŭ���������� �����ؼ� ���
	
	
	
	
		}
	}
