package cleancode.studycafe.mission.studyCafe.exception;

public class FileReadException extends RuntimeException{
    public FileReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
