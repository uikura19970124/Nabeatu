package nabeatu1;

public class Main {

	public static void main(String[] args) {
		Math math = new Math();

		for(int i=1;i<=40;i++){
			if (i%3==0 || math.Search(i) == 0 ){
				System.out.println("Aho");
			}else {
				System.out.println(i);
			}
		}
	}


}


