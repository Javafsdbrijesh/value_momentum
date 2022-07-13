package com.javafsd.departmenservice.error;

public class DepartmenNotFoundException extends Exception
{
    private static final long serialVersionUID = 1L;

    public DepartmenNotFoundException() {
        super();
    }

    public DepartmenNotFoundException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) 
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public DepartmenNotFoundException(String message, Throwable cause) 
    {
        super(message, cause);
    }

    public DepartmenNotFoundException(String message) 
    {
        super(message);
    }

    public DepartmenNotFoundException(Throwable cause) 
    {
        super(cause);
    }
}