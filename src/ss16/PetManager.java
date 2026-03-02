package src.ss16;

public class PetManager extends InventoryManager<Pet> {

    public Pet findById(String id) {
        for (Pet pet : items) {
            if (pet.getId().equals(id)) {
                return pet;
            }
        }
        return null;
    }

    public boolean deleteById(String id) {
        Pet pet = findById(id);
        if (pet != null) {
            return remove(pet);
        }
        return false;
    }
}