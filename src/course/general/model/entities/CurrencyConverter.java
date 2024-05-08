package course.general.model.entities;

public class CurrencyConverter {

    public static double dollar_quotation;
    public static double quantity;

    public static double converter(){
        return (dollar_quotation * quantity) + (dollar_quotation * quantity) * 0.06;
    }
}
