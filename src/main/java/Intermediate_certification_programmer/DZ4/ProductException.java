package Intermediate_certification_programmer.DZ4;

public class ProductException extends RuntimeException {

    public ProductException() {
        super("Не совершать данную покупку! Товар не существуют");
    }
}
