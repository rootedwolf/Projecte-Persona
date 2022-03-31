package Persona;

/**
 * Fitxer: TestPersona.java
 * Descripció: Classe de test de la classe "Persona"
 * 
 * @author Marc Nicolau
 */
class TestPersona {

    public static void main(String args[]) {

        Persona p1 = new Persona();
        Persona p2 = new Persona();

        p1.setDni("00000000");
        p1.setNom("Pepe Gotera");
        p1.setEdat(33);

        System.out.println("Visualització de persona p1:");
        p1.mostrar();
        System.out.printf("El dni de p1 és %s\n", p1.getDni());
        System.out.printf("El nom de p1 és %s\n", p1.getNom());
        System.out.printf("L'edat de p1 és %d\n", p1.getEdat());

        System.out.println("Visualització de persona p2:");
        p2.mostrar();
    }
}