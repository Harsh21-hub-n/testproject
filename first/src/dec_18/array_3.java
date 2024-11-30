package dec_18;

import java.util.Arrays;

public class array_3 {

	//search element in array

	public static void main(String[]arg) {


		array_3 y= new array_3();
		// y.n();

		// y.n2();
		y.n3();




	}


	void n() {
       int a[] = {10,20,30,40};

		int search_same =300;



		boolean w= 	false;

		for(int i=0 ; i<=a.length-1;i++) {

			if(a[i]== search_same) {

				System.out.println("same value");

				w=true;

				break;

			}
		}

		if(!w) {

			System.out.println(" not same");
		}



	}

	  // find number of repetations


	void n2() {

		int k[]= {100,200,30,100,40,100,50,20,100};

		// for printing array without for loop

				System.out.println(Arrays.toString(k));

		int count =0;

		int compare=100;

		for(int i=0; i<=k.length-1; i++) {

			if(k[i]==compare) {

				count++;
			}

		}

		System.out.println(count);


	}

	void n3() {

		// sorting array

		int z[]= {20,50,40,30,10};

		System.out.println("before sorting");

		System.out.println(Arrays.toString(z));

		Arrays.sort(z);

		System.out.println(" after sorting");

		System.out.println(Arrays.toString(z));
	}


}
