package aula03;

public class Exemplo {
    public static void main(String[] args) {
    MinhaClasse obj = new MinhaClasse();

    System.out.println("Atributo default: " + obj.defaultAtributo);
    System.out.println("Atributo protected: " + obj.protectedAtributo);
    System.out.println("Atributo public: " + obj.publicoAtributo);

    obj.defaultMetodo();
    obj.protectedMetodo();
    obj.publicMetodo();

    obj.chamarPrivate();

    SubClasse sub = new SubClasse();
    sub.acessarAtributos();
    }
}
