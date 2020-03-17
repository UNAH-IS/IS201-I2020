package interfaces;

public interface Humano extends SerVivo{
	public static final int ALTURA_PROMEDIO = 179;
	
	public abstract void caminar();
	public abstract void saltar();
	public abstract void comer();
}
