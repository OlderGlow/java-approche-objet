package fr.diginamic.exception;

public class LogementDejaReserveException extends Exception {
    public LogementDejaReserveException() {
        super("L'appartement est déjà réservé");
    }
}
