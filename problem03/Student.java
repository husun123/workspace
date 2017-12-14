class Student {
	//속성(Instance Varialbe), 멤버 변수(Member Variable)
	int studentId;	// 학번
	String name;	// 이름
	int age;		// 나이
	String major;	// 전공
	int grade;		// 학년
	
	//생성자(Constructor)
	public Student(int studentId, String name, int age, String major, 
		int grade) {
		this.studentId = studentId;
		this.name = name;
		this.age = age;
		this.major = major;
		this.grade = grade;
	}
	
	// 괄호 안에 들어가는 것들을 Parameter(Argument)라고 한다.
	// 매서드(Method)
	String study() {
		return this.name + "(이)가" + this.major + "공부를 한다.";
	}

	String introduce() {
		return "저는" + this.major + " " + this.grade + "학년" + " 에 재학중인" + this.name + "입니다.";
	}
}