import java.sql.SQLData;

public class MyException extends Exception {
    public void meth(int soul){
        
        try{
            if ((!(0<=soul && soul<=100))){
                throw new IllegalArgumentException("Душа должна принимать значения на отрезке [0; 10].");
            }} catch (IllegalArgumentException e){
            System.out.println("Так низя, потому что " + e.getMessage());
            System.exit(33);
        }
    }
}
