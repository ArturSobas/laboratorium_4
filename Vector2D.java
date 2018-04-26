
public class Vector2D {
	public double x, y;
	
	//konstruktor domyœlny
	Vector2D(){
		this.x = 0;
		this.y = 0;
	}
	
	//konstruktor z parametrami
	Vector2D(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	//metoda zwracajaca sume dwoch obiektow klasy Vector2D
	public Vector2D dodaj(Vector2D vector) {
		Vector2D vectorWynikowy = new Vector2D();
		
		vectorWynikowy.x = this.x + vector.x;
		vectorWynikowy.y = this.y + vector.y;
		
		return vectorWynikowy;
	}
	
	//metoda zwracajaca roznice dwoch obiektow klasy Vector2D
	public Vector2D odejmij(Vector2D vector) {
		Vector2D vectorWynikowy = new Vector2D();
		
		vectorWynikowy.x = this.x - vector.x;
		vectorWynikowy.y = this.y - vector.y;
		
		return vectorWynikowy;
	}
	
	//metoda zwracajaca zwracajaca iloczn obiektu klasy Vector2D przez stala
	public Vector2D mnozPrzezStala(double stala) {
		Vector2D vectorWynikowy = new Vector2D();
		
		vectorWynikowy.x = this.x * stala;
		vectorWynikowy.y = this.y * stala;
		
		return vectorWynikowy;
	}
	
	//metoda zwracajaca dlugosc wektora
	public double dlugoscWektora() {
		return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
	}
	
	//metoda zwracajaca wektor znormalizowany
	public Vector2D normalizuj() {
		Vector2D vectorWynikowy = new Vector2D();
		
		vectorWynikowy.x = this.x / this.dlugoscWektora();
		vectorWynikowy.y = this.y / this.dlugoscWektora();
		
		return vectorWynikowy; 
	}
}
