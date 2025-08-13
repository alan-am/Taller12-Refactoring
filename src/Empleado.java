    
public class Empleado {
    private String nombre;
    private double salarioBase;
    private int horasTrabajadas;
    private String departamento;
    private double tarifaHora;
    protected String genero;
    

    public Empleado(){}
    public Empleado(String nombre, double salarioBase, int horasTrabajadas, double tarifaHora, String departamento) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
        this.departamento = departamento;
    }

    public double calcularSalario() {
        validarSalarioYHoras();
        double salarioTotal = salarioBase;
        salarioTotal += calcularHorasExtra();
        salarioTotal += calcularBonoDepartamento();
        return salarioTotal;
    }

    private void validarSalarioYHoras() {
        if (salarioBase <= 0) {
            throw new IllegalArgumentException("El salario debe ser mayor o igual a 0");
        }
        if (horasTrabajadas < 0) {
            throw new IllegalArgumentException("Las horas trabajadas deben ser mayor o igual a 0");
        }
    }

    private double calcularHorasExtra() {
        if (horasTrabajadas > 40) {
            return (horasTrabajadas - 40) * 50;
        }
        return 0;
    }

    private double calcularBonoDepartamento() {
        switch (departamento) {
            case "Sistemas":
                return 20;
            case "Contabilidad":
                return 10;
            default:
                return 0;
        }
    }

    public void imprimirDetallesBase() {
        System.out.println("Nombre: " + getNombre());
    }
    
    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Genero: " + getNombre());
        System.out.println("Salario: " + getSalarioBase());
        System.out.println("Horas trabajadas: " + getHorasTrabajadas());
        System.out.println("Departamento: " + getDepartamento());
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    // Más metodos
}
