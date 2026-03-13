public class CustomerObserver implements Observer {

    @Override
    public void update(Envio e) {
        System.out.println("Cliente notificado: El envío " + e.getId() + " cambió de estado a " + e.getEstado());
    }

}