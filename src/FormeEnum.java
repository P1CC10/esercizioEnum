enum TipoForma {
        TRIANGOLO,
        RETTANGOLO
    }

    // Classe base Forma
    public class FormeEnum {
        private TipoForma tipo;

        public FormeEnum(TipoForma tipo) {
            this.tipo = tipo;
        }

        public TipoForma getTipo() {
            return tipo;
        }

        public void setTipo(TipoForma tipo) {
            this.tipo = tipo;
        }

        public void calcolaArea() {
            System.out.println("Calcolo dell'area per la forma di tipo " + tipo);
        }

    }