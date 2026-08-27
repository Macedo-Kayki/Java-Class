package aula03;

class MinhaClasse {
    int defaultAtributo = 1;

    protected int protectedAtributo = 2;

    public int publicoAtributo = 3;

    private int privateAtributo = 4;
    
    void defaultMetodo(){
        System.out.println("Método default ");
    }

    protected void protectedMetodo(){
        System.out.println("Método protected");
    }

    public void publicMetodo(){
        System.out.println("Método public " + this.privateAtributo);
    }

    private void privateMetodo(){
        System.out.println("Método private");
    }

    public void chamarPrivate(){
        privateMetodo();
    }
}