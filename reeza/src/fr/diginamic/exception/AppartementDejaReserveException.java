package fr.diginamic.exception;

public class AppartementDejaReserveException extends Exception {

    public AppartementDejaReserveException() {
        super("L'appartement est déjà réservé");
    }
}
