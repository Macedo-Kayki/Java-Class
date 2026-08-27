package aula03;

class SubClasse extends MinhaClasse {
    void acessarAtributos() {
        System.out.println("\n Na SubClasse:");
        System.out.println("Atributo default: " + defaultAtributo);
        System.out.println("Atributo protected: " + protectedAtributo);
        System.out.println("Atributo public: " + publicoAtributo);

        defaultMetodo();
        protectedMetodo();
        publicMetodo();
    }
}