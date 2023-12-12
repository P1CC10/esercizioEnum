public class Rettangolo extends FormeEnum {

    public int base;
    public int altezza;
    public Rettangolo(int base, int altezza) {
        super(TipoForma.RETTANGOLO);
        this.base=base;
        this.altezza=altezza;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltezza() {
        return altezza;
    }

    public void setAltezza(int altezza) {
        this.altezza = altezza;
    }

    @Override
    public void calcolaArea() {
        int area = (base * altezza);
        System.out.println("L'area del rettangolo è: " + area);
    }
}

