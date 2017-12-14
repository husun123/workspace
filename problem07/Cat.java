class Cat	{
	
	String type;
	String name;
	int age;
	String gender;
	
	public Cat(String type, String name, int age, String gender) {
	
		this.type = type;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	boolean equals(Cat p) {{
		if (this.type == p.type) {if (this.name == p.name)
			return true;
	}}
			return false;
	}
		
}