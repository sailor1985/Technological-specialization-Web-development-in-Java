package Intermediate_certification_programmer.DZ4;

public class CustomerException extends RuntimeException {

    public CustomerException() {
        super("Ошибка! Попытка совершения покупки не существующим покупателем");
    }
}
