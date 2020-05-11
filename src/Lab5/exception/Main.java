package Lab5.exception;

public class Main {
    public static void main(String[] args) {
        SomeClass sc=new SomeClass();
        try{
            sc.methodUncheckedException(2);
            sc.methodUncheckedException(0);

            sc.methodCheckedException(2);
        }catch(ChException exception){
            exception.getStackTrace();
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("after exception");
    }

}
