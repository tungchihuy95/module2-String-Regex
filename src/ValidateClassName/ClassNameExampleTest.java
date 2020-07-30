package ValidateClassName;

import ValidateAccount.AccountExample;

import static ValidateAccount.AccountExampleTest.validAccount;

public class ClassNameExampleTest {
    private ClassNameExample classNameExample;

    public static  final String [] validClassName = new String[] {"C2100G", "A9375M","A7364K", "P2456H"};
    public static final String[] invalidClassName = new String[] {"B7879M", "A2345Z", "A91234G", "8T9897H", "KI24__35I"};

    public static void main(String[] args) {
        ClassNameExample classNameExample = new ClassNameExample();
        for (String className : validClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("ClassName:" + className + " is valid:" + isvalid);

        }
        for (String className : invalidClassName) {
            boolean isvalid = classNameExample.validate(className);
            System.out.println("ClassName:" + className + " is valid:" + isvalid);
        }
    }
}
