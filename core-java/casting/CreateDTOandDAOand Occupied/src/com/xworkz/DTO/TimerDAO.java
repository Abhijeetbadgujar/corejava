package com.xworkz.DTO;

public class TimerDAO {

	private TimerDTO[] timerDTOs=new TimerDTO[40];
	private int fish=0;
	
	public TimerDAO(){
		
	}
	public void create(TimerDTO name) {
		if(fish<40 && name!=null) {
			this.timerDTOs[this.fish++]=name;
			System.out.println("working hrs are: "+name.getWorking());
		}else {
			System.out.println("index is full");
		}
	}
	public void create(TimerDTO name,int no) {
		if(fish<this.timerDTOs.length && no<=0 && name!=null) {
			this.timerDTOs[no]=name;
			
		}else {
			System.out.println("index is full in update");
		}
	}
	public void IndexOccupied() {
		System.out.println("index occupied : "+fish);
	}
	public boolean matchBydigital(String digital) {
		for(int x=0;x<40;x++) {
			TimerDTO ref=this.timerDTOs[x];
			if(ref!=null) {
				System.out.println("ref of index is :".concat(String.valueOf(x)));
				String ref1=ref.getDigital();
				if(digital.equals(ref1));
				System.out.println("matching the value"+ref1);
				return true;
			}
		}
	
	return false;
}
	public TimerDTO[] getDigital() {
		return timerDTOs;
	}
}
