package vn.fptaptech;

public class AgeCheckingException extends Exception {
    public AgeCheckingException(String message){
        super(message); // goi lop cha
        @Override//annotation  thay doi method, properties cua doi tuong trong class
        public String getMessage(){

        }
    }
}
