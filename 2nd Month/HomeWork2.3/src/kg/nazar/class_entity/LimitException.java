package kg.nazar.class_entity;

public class LimitException extends Throwable {
    private double remainingAmount;
    private String message;

    public LimitException(double remainingAmount, String message) {
        this.remainingAmount = remainingAmount;
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public double getRemainingAmount() {
        return remainingAmount;
    }

}
