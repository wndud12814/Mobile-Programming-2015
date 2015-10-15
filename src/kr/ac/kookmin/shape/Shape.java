package kr.ac.kookmin.shape;

public abstract class Shape {
	 protected Point center;
	 
	 Shape(Point center){
		 this.center = center;
	 }
	 
	 Point getCenter(){
		 return center;
	 }
	 abstract Rectangle getBounds();
	 abstract void draw(Graphics g);
}
