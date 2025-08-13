public class EmpleadoPorHoras extends Empleado {
    

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaHora, String departamento, String genero) {
        super(nombre, 0, horasTrabajadas, tarifaHora, departamento);
        super.setSalarioBase(calcularSalario());
        this.genero = genero;
    }

    public void imprimirDetalles() {
        super.imprimirDetallesBase();
        System.out.println("Genero: " + genero);
    }
    
    @Override
    public double calcularSalario() {
        return super.getHorasTrabajadas() * super.getTarifaHora();
    }

    // Más metodos
}