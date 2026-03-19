public class ExpressShippingStrategy implements ShippingStrategy {

    @Override
    public double calcularCosto(Envio e) {
        return 25.0; // costo fijo de envío express
    }

}


