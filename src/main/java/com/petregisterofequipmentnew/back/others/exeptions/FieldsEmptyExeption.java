package com.petregisterofequipmentnew.back.others.exeptions;

public class FieldsEmptyExeption extends MainException{
    public FieldsEmptyExeption(String message) {
        super(message);
    }

    public FieldsEmptyExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public FieldsEmptyExeption(Throwable cause) {
        super(cause);
    }
}
