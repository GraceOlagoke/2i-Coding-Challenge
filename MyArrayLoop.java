public class MyArrayLoop{
static int a=2;
static int x = 5;

public static void main(String[] args){
System.out.println("mutliples of A until X");
MyMultiple();

System.out.println("Multiples of A+1 until 2X");
SecondMultiple();

System.out.println("Multiples of A+2 until 3X");
ThirdMultiple();
}

public static void MyMultiple(){
int[] multiple = new int[x];
for (int i =0; i<x; i++){
multiple[i] = i*a;
System.out.println(multiple[i]);
}
}

public static void SecondMultiple(){
int limit = 2*x;
int[] doubleMultiple = new int[limit];
for (int i =0; i<limit; i++){
doubleMultiple[i]= (i*(a+1));
System.out.println("");
System.out.println(doubleMultiple[i]);
}
}

public static void ThirdMultiple(){
int limit = 3*x;
int[] tripleMultiple = new int[limit];
for (int i=0; i<limit; i++){
tripleMultiple[i] = (i*(a+2));
System.out.println("");
System.out.println(tripleMultiple[i]);
}
}
}
