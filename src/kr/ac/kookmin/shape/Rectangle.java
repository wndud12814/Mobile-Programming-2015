package kr.ac.kookmin.shape;

public class Rectangle extends Shape{
	//Implement here
		private int h;
		private int w;
		
		Rectangle(Point center, int w, int h){
			super(center);
			this.w=w;
			this.h=h;
		}
		public Rectangle getBounds() {
			return this;
		}
		int getHeight(){
			return h;
		}
		int getWidth(){
			return w;
		}
		@Override
		public void draw(Graphics g) {
			g.draw(this);
		}
		@Override
		public String toString() {
			return "Rectangle";
		}
}
