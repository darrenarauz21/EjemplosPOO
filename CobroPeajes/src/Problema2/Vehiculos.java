package Problema2;

public class Vehiculos {
	
	
	private int vlivianos, buses, clivianos,cpesados;
	private double[] tarifas = {2.30,5.30,3.35,7.00};
	private double totalvl=0.00, totalb=0.00, totalcl = 0.00, totalcp = 0.00;
	private String[] tipos = {"Vehiculos livianos","Buses", "Camiones livianos", "Camiones pesados"};
 /**********************MOSTRAR E INSERTAR DATOS*************************/   
    public int getVlivianos() {
        return vlivianos;
    }

    public void setVlivianos(int vlivianos) {
        this.vlivianos = vlivianos;
    }
    
    public int getBuses() {
        return buses;
    }

    public void setBuses(int buses) {
        this.buses = buses;
    }
    
    public int getClivianos() {
        return clivianos;
    }

    public void setClivianos(int clivianos) {
        this.clivianos = clivianos;
    }
    
    public int getCpesados() {
        return cpesados;
    }

    public void setCpesados(int cpesados) {
        this.cpesados = cpesados;
    }
    
    public double[] getTarifas() {
        return tarifas;
    }
    
    public String[] getTipos() {
    	return tipos;
    }

	public void setTotalvl(double totalvl) {
		this.totalvl = totalvl;
	}
	public double getTotalvl() {
        return totalvl;
    }
	public void setTotalb(double totalb) {
		this.totalb = totalb;
	}
	public double getTotalb() {
        return totalb;
    }
	public void setTotalcl(double totalcl) {
		this.totalcl = totalcl;
	}
	public double getTotalcl() {
        return totalcl;
    }
	public void setTotalcp(double totalcp) {
		this.totalcp = totalcp;
	}
	public double getTotalcp() {
        return totalcp;
    }
    
}
