package aston.hometask;

import java.io.IOException;

public class MyIOException extends IOException {
    public MyIOException(String message) {
        super(message);
    }

    public MyIOException(String message, Throwable cause) {
        super(message, cause);
    }
}
