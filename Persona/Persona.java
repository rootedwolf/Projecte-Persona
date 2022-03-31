package Persona;

/**
 * Fitxer: Persona.java
 * Descripció: Disseny de la classe "Persona"
 * 
 * @author Marc Nicolau
 */
class Persona {
    // Atributs
    private String dni;
    private String nom;
    private short edat;

    // Mètodes constructors
    public Persona() {
    }

    public Persona(String sDni, String sNom, int nEdat) {
        dni = sDni;
        nom = sNom;
        if (nEdat >= 0 && nEdat <= Short.MAX_VALUE)
            edat = (short) nEdat;
    }

    /**
     * Assignar el valor de l'artribut DNI
     * 
     * @author Marc Nicolau
     */
    public void setDni(String nouDni) {

        // Aquí hi hauria d'haver una rutina de verificació del DNI
        // i actuar en conseqüència (a través de les excepcions).
        dni = nouDni;
    }

    /**
     * Assignar el valor de l'artribut nom
     * 
     * @author Marc Nicolau
     */
    public void setNom(String nouNom) {
        nom = nouNom;
    }

    /**
     * Assignar el valor de l'artribut edat
     * 
     * @author Marc Nicolau
     */
    public void setEdat(int novaEdat) {
        edat = (short) novaEdat;
    }

    /**
     * Retorna el valor de l'artribut DNI
     *
     * @returns el DNI de la persona
     */
    public String getDni() {
        return dni;
    }

    /**
     * Retorna el valor de l'artribut nom
     *
     * @returns el nom de la persona
     */
    public String getNom() {
        return nom;
    }

    /**
     * Retorna el valor de l'artribut edat
     *
     * @returns l'edat de la persona
     */
    public short getEdat() {
        return edat;
    }

    /**
     * Mostra per pantalla les dades dels atributs de l'objecte
     */
    public void mostrar() {
        System.out.printf("Dni...........: %s\n", dni);
        System.out.printf("Nom...........: %s\n", nom);
        System.out.printf("Edat..........: %d\n", edat);
    }
}