package com.ll.jumptospringboot.exception;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_MODIFIED, reason = "already voted")
public class AlreadyVotedException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public AlreadyVotedException(String message) {
        super(message);
    }
}