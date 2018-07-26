package book_2018_07_24_stack;
/** 
* @author nilzxq
* @version 2018年7月26日 下午6:15:00 
* 类说明 
*/
public class PetEnterQueue {

	private Pet pet;
	private long count;
	
	public PetEnterQueue(Pet pet,long count) {
		this.pet=pet;
		this.count=count;
	}

	public Pet getPet() {
		return this.pet;
	}

	public long getCount() {
		return this.count;
	}

	public String getEnterPetType() {
		return this.pet.getPetType();
	}
	
}
