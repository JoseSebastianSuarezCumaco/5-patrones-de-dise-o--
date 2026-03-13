public class InternationalShippingStrategy implements ShippingStrategy {

    @Override
    public double calcularCosto(Envio e) {
        return 50.0; // costo fijo de envío internacional
    }

}