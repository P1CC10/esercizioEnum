public class Triangolo extends FormeEnum {

    public int base;
    public int altezza;
    public Triangolo(int base, int altezza) {
        super(TipoForma.TRIANGOLO);
        this.base=base;
        this.altezza=altezza;


    }

    @Override
    public void calcolaArea() {
        int area = (base * altezza) /2;
        System.out.println("L'area del triangolo è: " + area);
    }
}

