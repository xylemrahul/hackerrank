package demo.testdome;

public class TextInput {

    public String strVal = "";
    public void add(char c){

        strVal = strVal + c;
    }

    public String getValue(){

        if(strVal.length() !=0){
            return strVal;
        }
        return "";
    }
}
