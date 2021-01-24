package Questions;

public class AccessSpecifier {
    private int var1;
    public int var2;
    int var3;

    public void showDetails(){
        System.out.println("variablea "+ var1+ "Variableb "+ var2+"Variablec "+var3 );
    }



    public static void main(String [] args){
        AccessSpecifier variable = new AccessSpecifier();
        variable.var1 = 1;
        variable.var2 = 1;
        variable.showDetails();
    }
}
