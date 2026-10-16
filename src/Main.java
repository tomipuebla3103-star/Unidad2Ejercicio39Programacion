//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    EscanearLaser Laser = new EscanearLaser();
    CamaraQR Camara = new CamaraQR();
    PuntoVenta Venta = new PuntoVenta();

    Venta.procesarProducto(Laser.escanearCodigo());
    Venta.procesarProducto(Camara.escanearCodigo());
}
