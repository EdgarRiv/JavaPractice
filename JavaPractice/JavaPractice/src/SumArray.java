
public class SumArray {

	public static void main(String[] args) {
		int arrayTest[] = {1,2,3,4,5,6,67,10};
		int arrayTest2[] = {10,1,2,52,250,20,11,2030};
		int a = 0;
		int b = 0;
		
		
		for(int i = 0 ; i < arrayTest.length ; i++) {
			if(i == arrayTest.length-1) {
				System.out.print(arrayTest[i]);
			}else {
				System.out.print(arrayTest[i] + ", ");
			}
			
			if(a < arrayTest[i]) {
				a = arrayTest[i];
			}
		}
		System.out.println();
		System.out.print("First array highest value is : " + a);
		System.out.println();
		
		for(int i = 0 ; i < arrayTest2.length ; i++) {
			if(i == arrayTest2.length-1) {
				System.out.print(arrayTest[i]);
			}else {
				System.out.print(arrayTest2[i] + ", ");
			}if(b < arrayTest2[i]) {
				b = arrayTest2[i];
			}			
		}
		System.out.println();
		if(a<b) {
			System.out.print("The highest value is in Array 2 : " + b);
		}else {
			System.out.print("The highest value is in Array 1 : " + a);
		}
		
		
	}
}
