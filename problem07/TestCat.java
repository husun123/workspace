public class TestCat {
	
		public static void main(String[] args) {
			
			Cat kevyn = new Cat("koreanshothair", "케빈",2 , "male");
			Cat root = new Cat("koreanshothair", "루트", 3, "male");
			
			boolean isEqual = kevyn.equals(root);
			System.out.println(isEqual);
		}
}