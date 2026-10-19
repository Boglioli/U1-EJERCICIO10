public class ProyectoSoftware {
private String nombreProyecto;
private String clienteEmpresa;
private int faseActual;

public ProyectoSoftware(String nombreProyecto, String clienteEmpresa, int faseActual) {
    this.nombreProyecto = nombreProyecto;
    this.clienteEmpresa = clienteEmpresa;
    this.faseActual = faseActual;
}
public void avanzarFase() {
    if (faseActual < 3) {
        faseActual++;
    }
}
public String obtenerEstado() {
    switch (faseActual) {
        case 1:
            return "analisis";
        case 2:
            return "desarrollo";
        case 3:
            return "despliegue";
        default:
            return "fase desconocida";
    }
}
}
