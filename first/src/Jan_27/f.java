package Jan_27;

public class f {

public static void main(String[]arg)
{
	int a=m1();
	System.out.println(a);
	f z=new f();
	float b=z.m2();
	System.out.println(b);
	int w=1000;
	w=f.m3(w);
	System.out.println(w);

}
static int m1() {
	int s=100;
	return s;
}
float m2() {

	float x=200.5f;
	return x;
}
static int m3(int v) {
	int s;
	s=v+100;
	System.out.println(v);
	return s;
}
}
