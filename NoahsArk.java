public class NoahsArk {
	public static void main(String[] args) {
		NoahsArk ark = new NoahsArk();
		List<Animal> animals = ark.findAnimals();
		ark.callAnimals(animals);
		ark.setSail();
	}
	
	public void setSail() {
		System.out.println("\nThe Ark is now full, here comes the flood!");
	}
	
	public void callAnimals(List<Animal> animals) {
		for(int i=0; i<animals.size(); i++) {
			animals.getValue(i).call();
		}
	}
	
	public List<Animal> findAnimals() {
		System.out.println("Noah is looking for animals to board the Ark...\n");
		List<Animal> foundAnimals = new GenericList<Animal>();
		for(Species s : Species.values()) {
			Animal newAnimal;
			switch(s) {
				case BEAR:
					newAnimal = new Bear();
					break;
				case BEETLE:
					newAnimal = new Beetle();
					break;
				case CAT:
					newAnimal = new Cat();
					break;
				case CROCODILE:
					newAnimal = new Crocodile();
					break;
				case DOG:
					newAnimal = new Dog();
					break;
				case DOLPHIN:
					newAnimal = new Dolphin();
					break;
				case EAGLE:
					newAnimal = new Eagle();
					break;
				case FLY:
					newAnimal = new Fly();
					break;
				case FROG:
					newAnimal = new Frog();
					break;
				case LIZARD:
					newAnimal = new Lizard();
					break;
				case MONKEY:
					newAnimal = new Monkey();
					break;
				case PIGEON:
					newAnimal = new Pigeon();
					break;
				case SALMON:
					newAnimal = new Salmon();
					break;
				case SHARK:
					newAnimal = new Shark();
					break;
				case SNAKE:
					newAnimal = new Snake();
					break;
				case WHALE:
					newAnimal = new Whale();
					break;
				default:
					System.out.println("Something went horribly wrong!");
					return null;
			}
			foundAnimals.add(newAnimal);
		}
		return foundAnimals;
	}
}