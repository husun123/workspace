class Student {
	//�Ӽ�(Instance Varialbe), ��� ����(Member Variable)
	int studentId;	// �й�
	String name;	// �̸�
	int age;		// ����
	String major;	// ����
	int grade;		// �г�
	
	//������(Constructor)
	public Student(int studentId, String name, int age, String major, 
		int grade) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}
	
	// ��ȣ �ȿ� ���� �͵��� Parameter(Argument)��� �Ѵ�.
	// �ż���(Method)
	String study() {
		return this.name + "(��)��" + this.major + "���θ� �Ѵ�.";
	}

	String introduce() {
		return "����" + this.major + " " + this.grade + "�г�" + " �� ��������" + this.name + "�Դϴ�.";
	}
}