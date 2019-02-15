package demo.testdome;

public class NumericInput extends TextInput {

    String str = "";
    @Override
    public void add(char c) {
        if(c<65)
        {
            str = str + c;
        }
    }

    @Override
    public String getValue() {
        return str;
    }
}
