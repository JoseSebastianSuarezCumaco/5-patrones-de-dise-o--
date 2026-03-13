    public class WarehouseObserver implements Observer {

    @Override
    public void update(Envio e) {
        System.out.println("Almacen notificado: el envio " + e.getId() +" cambio al estado " + e.getEstado());
    }

}