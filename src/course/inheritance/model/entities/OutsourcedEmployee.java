package course.inheritance.model.entities;

import course.inheritance.model.entities.Employee;

public class OutsourcedEmployee extends Employee {

    private Double additionalCharge;

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        additionalCharge = (1.1 * additionalCharge);
        return super.payment() + additionalCharge;

    }
}
