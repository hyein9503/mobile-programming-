package kr.ac.kookmin.shape;

public abstract class Shape {
	 protected Point center;
	 
	 private int w;
	 private int h;
	
		 
	 public Point getCenter(){
		 
		 return this.center;
		 }
	 
	 public Rectangle getBounds(){
		return new Rectangle(center, w*2, h*2);
		 			 
		 }
	 public void draw(Graphics g){
		// g= new Graphics();
		 
		g.draw(this);
	 }


}
