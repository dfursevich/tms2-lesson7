package by.teachmeskills.lesson7.cw.enumeration;

/**
 * @author Dzmitry Fursevich
 */
public enum ErrorCode {
    NOT_FOUND(404),
    NOT_AUTHORIZED(403);

    private int code;

    ErrorCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
