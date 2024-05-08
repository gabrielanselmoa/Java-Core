package course.composition.q4.model.exceptions;

public class DomainException extends Exception{
    //Extends from Exception (Needs to be treated)
    // Extends from RuntimeException (Does not need to be treated)
    public DomainException(String message){
        super(message);
        //Passing message to Super means that I'll
        //be able to get this message in my Exceptions
    }

}
