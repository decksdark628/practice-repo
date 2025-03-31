import java.awt.Point;

public class Punto3D extends Point{
	private int z;

	public Punto3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}

	public int getZ(){
		return z;
	}
	public void setZ(int z){
		this.z = z;
	}

	public void move(int x, int y, int z){
		super.move(x, y);
		this.z = z;
	}

	public void translate(int x, int y, int z){
		super.translate(x, y);
		this.z += z;
	}

	public String toString(){
		return super.toString() + ",z : " + z; 
	}

	public boolean equals(Object obj){
		boolean esIgual = false;
		Punto3D temp = null;

		if (obj != null){
			if (obj instanceof Punto3D){
				temp = (Punto3D)obj;
				if (super.x == temp.getX() && super.y == temp.getY() && z == temp.getZ())
						esIgual = true;
			}
		}

		return esIgual;
	}
}
