package demo.testdome;

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('A');
        input.add('0');
        System.out.println(input.getValue());
    }
}
