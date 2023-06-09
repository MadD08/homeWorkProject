package homeWorks;

class MyClass {
    int year = 2023;

    public static int sumMethod(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(sumMethod(2, 2));
    }
}

/*Changes were applied based on the JAVA naming conventions.
 * Thus the class name was adjusted to be displayed in PascalCase,
 * while method names were re-written in lower camel case.
 * Also, I took the opportunity and rename the initial method and variable within the method in order
 * for them to clearly state their function.
 * Comment was removed because it stated an obvious fact.
 * Removed the redundant c variable in order to simplify the code, since there was no need to declare and then return it.
 * Added sout method in order to visualize actions of our method.
 * Unfortunately, the purpose of the year variable remains unclear to me.
 * However, since I am not the author of the code, I decided to leave it there
 * while keeping in mind that it might be used in the future.*/