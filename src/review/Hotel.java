package review;

public class Hotel {
	int[] room;
	boolean[] rOccuped;
	int[] pOld;
	int[] pYoung;
	public Hotel() {
		
	}
	
	public Hotel(int rooms) {
		this.room = new int[rooms];
		this.rOccuped = new boolean[rooms];
		this.pYoung = new int[rooms];
		this.pOld = new int[rooms];
		for(int i = 0; i < rooms;i++) {
			this.pYoung[i] = 0;
			this.pOld[i] = 0;
			this.room[i] = 0;
			this.rOccuped[i] = false;
		}
	}
	
	public void ocuparHabitacion(int mayores, int menores) {
		if((mayores+menores)>8) {
			System.out.print("Supera las 8 personas");
		}else {
			int rL = this.room.length;
			for(int i = 0; i < rL; i++) {
				if(this.rOccuped[i]) {
					continue;
				}else {
					this.room[i] = mayores + menores;
					this.pYoung[i] = menores;
					this.pOld[i] = mayores;
					this.rOccuped[i] = true;
					break;
				}
			}
		}
	}
	
	public int contarHabitaciones(int mayores) {
		
		return 0;
	}
	
	public void imprimirAlgo() {
		int rL = this.room.length;
		for(int i = 0; i < rL; i++) {
			System.out.println(this.room[i]);
		}
	}
}
