public static void main(String[] args) {
    ProyectoSoftware proyecto = new ProyectoSoftware("sistema de ventas", "Empresa XYZ", 1);
    System.out.println("fase inicial: " + proyecto.obtenerEstado());
    proyecto.avanzarFase();
    System.out.println("avanza proyecto: " + proyecto.obtenerEstado());
    proyecto.avanzarFase();
    System.out.println("avanza proyecto: " + proyecto.obtenerEstado());
}

