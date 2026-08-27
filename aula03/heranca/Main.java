package heranca;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Minnie", 33, 123);
        System.out.println(a1.toString());

        Professor p1 = new Professor("Raphael", 42, "Programação OO");
        System.out.println(p1.toString());
    }
}
