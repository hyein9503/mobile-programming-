package kr.ac.kookmin.shape;

public class Ellipse extends Shape {
	private int w;
	private int h;
	private Point center;
	
public Ellipse(Point center,int w,int h)
{
	this.center=center;
	this.w=w;
	this.h=h;
}
public Point getCenter(){
	return center;
}
    public Rectangle getBounds(){
	return new Rectangle(center, w*2, h*2);
	
    }
	public int getSemiMajorAxis(){
		return w;
	}
	public int getSemiMinorAxis(){
		return h;
	}


@Override
public  void draw(Graphics g) {
	g.draw(this);
}
@Override
public String toString() {
	return "Ellipse";
}


}
