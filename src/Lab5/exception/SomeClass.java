package Lab5.exception;

public class SomeClass {
    public void methodUncheckedException(int i){
        if(i==0)
        {
            UnchException e=new UnchException("create in methodUncheckedException. Divided by 0");
            throw e;
        }
        System.out.println("After unch exception. Result = "+5/i);
    }

    public void methodCheckedException(int i) throws ChException {
        if(i==2)
        {
            ChException c=new ChException("Number 2 not accepted");
            throw c;
        }
    }
}
