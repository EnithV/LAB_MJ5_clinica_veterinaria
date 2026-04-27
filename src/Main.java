public class Main {
    public static void main(String[] args) {

        Animal perro = new Perro("Max", 5, "Carlos", "Labrador");
        Animal gato = new Gato("Michi", 3, "Ana", true);
        Animal ave = new Ave("Piolin", 1, "Luis", 200);
        Animal conejo = new Conejo("Bugs", 2, "Pedro");

        // Fichas
        perro.imprimirFicha();
        gato.imprimirFicha();
        ave.imprimirFicha();
        conejo.imprimirFicha();

        // Vacunas
        if (perro instanceof Vacunable) {
            ((Vacunable) perro).registrarVacuna("Rabia");
            ((Vacunable) perro).registrarVacuna("Parvovirus");
        }

        if (gato instanceof Vacunable) {
            ((Vacunable) gato).registrarVacuna("Triple Felina");
            ((Vacunable) gato).registrarVacuna("Rabia");
        }

        System.out.println("Vacunas perro: " + ((Vacunable) perro).getVacunasAplicadas());
        System.out.println("Vacunas gato: " + ((Vacunable) gato).getVacunasAplicadas());

        // Asegurables
        Asegurable[] asegurables = {
                (Asegurable) perro,
                (Asegurable) gato,
                new Clinica("VetCare", "Bogotá")
        };

        for (Asegurable a : asegurables) {
            System.out.println(a.obtenerNumeroPoliza());
            System.out.println(a.calcularPrimaSeguro());
            System.out.println("-------------------");
        }
    }
}