public class multilevel{
	public static void main(String args[]){
		flow4 f = new flow4();
		f.display();
	}
}
class flow1{
	public void display(){
		System.out.println("this is first class");
	}
}
class flow2 extends flow1{

}
class flow4 extends flow2{

}
