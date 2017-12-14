class Board { 
	int number;
	String title;
	String content;
	String name;
	String regDate;

	public Board(int number, String title, String content,
			String name, String regDate) {
			this.number = number;
			this.title = title;
			this.content = content;
			this.name = name;
			this.regDate = regDate;
		}
		
	String text() {
		return this.number + " " + this.title + " " + this.content 
		+ " " + this.name + " " + this.regDate;
	}	
}