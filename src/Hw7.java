class Unit{
	
	int hp;
	final int MAX_HP;
	
	Unit(int max){
		MAX_HP = max;
	}
}
interface Repairable{
	
	
}
class GroundUnit extends Unit{
	
	GroundUnit(int max){
		super(max);
	}

}
class AirUnit extends Unit{
	
	AirUnit(int max){
		super(max);
	}
	
}
class Marine extends GroundUnit{
	
	Marine(){
		super(60);
		hp = 60;
	}
}
class Scv extends GroundUnit implements Repairable{
	
	Scv(){
		super(40);
		hp = 40;
	}
	
	public void repair(Repairable repairable) {
		
		if(repairable instanceof Unit) {
			Unit unit = (Unit) repairable;
			while(hp!=unit.MAX_HP) 
				hp++;
		System.out.println("�ش�"+unit.toString()+"�� ġ�ᰡ �Ϸ� �Ǿ����ϴ�");
		}
	}
	
}
class Tank extends GroundUnit implements Repairable{
	
	Tank(){
		super(150);
		hp = 125;
	}
	
	public String toString(){
		return "Tank";
	}
	
}
class Dropship extends AirUnit implements Repairable{
	
	Dropship(){
		super(125);
		hp = 110;
	}
	
	public String toString(){
		return "Dropship";
	}
}
public class Hw7 {

	public static void main(String[] args) {
		
		Tank tank = new Tank();
		Dropship dropship = new Dropship();
		Scv scv = new Scv();
		
		scv.repair(tank);
		scv.repair(dropship);

	}

}
