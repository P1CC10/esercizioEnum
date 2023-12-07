public class Rettangolo extends FormeEnum {
    public Rettangolo() {
        super(TipoForma.RETTANGOLO);
    }


    @Override
    public void calcolaArea() {
        System.out.println("Calcolo dell'area per un triangolo");

        int base = 5;
        int altezza = 2;
        int area = (base * altezza);
        System.out.println("L'area del rettangolo è: " + area);
    }
}

