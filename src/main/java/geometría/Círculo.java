package geometría;
public class Círculo {
	Punto CentroC = new Punto();
	public int radio = 2;
	public int CX = CentroC.getX();
	public int CY = CentroC.getY();
	public double AreaCi = Math.PI * Math.pow(radio,2);

}