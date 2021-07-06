package Thread_test;
public class test {
    public static void main(String[] arg){
        test1 t1 = new test1();
        test2 t2 = new test2();

        t1.start();
        t2.start();
    }   
}