package sk.kosickaakademia.stovcikova.thisandsuper;

public class Child extends Parent{
    String str="I am child";
    public void naa(){
        System.out.println("Ahoj" +str);
    }

    public void parentClassNaa(){
        super.naa();
    }
    public void parentClassNaaStr(){
        super.str="parent string changed";
        super.naa();
    }
}
