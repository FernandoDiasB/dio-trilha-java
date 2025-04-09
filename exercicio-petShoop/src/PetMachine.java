public class PetMachine {
    
    private boolean clean = true;
    private int water = 30 ;
    private int shampoo = 10;
    private Pet pet;

    public void takesShower(){
        if (this.pet == null) {
            System.out.println("Coloque o pet na banheira pra tomar banho");
            return;
        }


        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " ta limpinho!!");
    }

    public void addWater(){
        if (water == 30) {
            System.out.println("A capacidade de agua da maquina esta no maximo!");
            return;
        }
        water += 2;
    }

    public void addShampoo(){
        if (shampoo == 30) {
            System.out.println("A capacidade de shampoo da maquina esta no maximo!");
            return;
        }
        shampoo += 2;
    }

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet){
        if (!this.clean) {
            System.out.println("Primeiro precisa limpar a maquina para dar banho no pet!!");
            return;
            
        }
        if (hasPet()) {
            System.out.println("O pet " + this.pet.getName() + " esta na maquina!!");
        }
        this.pet = pet;
    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.println("O pet " + this.pet.getName() + " esta limpinho");
        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("Maquina limpa");
    }


}
