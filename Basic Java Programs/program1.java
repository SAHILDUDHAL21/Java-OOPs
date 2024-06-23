class Area{

	float a;

	void circle(float r){
		a=3.14f*r*r;
		System.out.println("Area of Circle= "+a);
	}
	void rectangle(float l,float b){
		a=l*b;
		System.out.println("Area of Rectangle="+a);
	}
	void square(float s){
		a=s*s;
		System.out.println("Area of Square="+a);
	}
	public static void main(String[] args) {
		Area ob=new Area();
		ob.circle(32f);
		ob.rectangle(5f,7f);
		ob.square(5f);
	}
}