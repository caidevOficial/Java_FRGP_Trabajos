package Entidad;

public class Seguro {

	private int Id;
	private String Descripcion;
	private int Tipo;
	private float CosContra;
	private float CosAseg;
	
	
	public Seguro()
	{
		
	}
	
	
	public Seguro(int id, String descri, int tipo, float costCont, float CostAseg)
	{
		this.Id = id;
		this.Descripcion = descri;
		this.Tipo = tipo;
		this.CosContra = costCont;
		this.CosAseg = CostAseg;
	}
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public int getTipo() {
		return Tipo;
	}
	public void setTipo(int tipo) {
		Tipo = tipo;
	}
	public float getCosContra() {
		return CosContra;
	}
	public void setCosContra(float cosContra) {
		CosContra = cosContra;
	}
	public float getCosAseg() {
		return CosAseg;
	}
	public void setCosAseg(float cosAseg) {
		CosAseg = cosAseg;
	}
	
	
}
