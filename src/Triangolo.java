public class Triangolo extends FormeEnum {
    public Triangolo() {
        super(TipoForma.TRIANGOLO);
    }


    @Override
    public void calcolaArea() {
        System.out.println("Calcolo dell'area per un triangolo");
        int base = 5;
        int altezza = 2;
        int area = (base * altezza) /2;
        System.out.println("L'area del triangolo è: " + area);
    }
}

