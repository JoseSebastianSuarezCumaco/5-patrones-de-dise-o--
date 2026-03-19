public class CustomerObserver implements Observer {

    @Override
    public void update(Envio e) {
        System.out.println("Cliente notificado: el envio " + e.getId() + " cambio al estado " + e.getEstado());
    }

}