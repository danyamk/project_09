package project_9;

public class Test {
    public static void main(String[] args) {
        Account acc1 = new Account("9876","Рукоблудович И.И.");
        Account.Check(acc1);

        Account acc2 = new Account("123","Чмыревывич Е.Е.");
        Account.Check(acc2);

        Account acc3 = new Account("1234567890","Лохович А.А.");
        Account.Check(acc3);
    }
}
