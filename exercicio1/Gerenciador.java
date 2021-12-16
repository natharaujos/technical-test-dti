import java.util.ArrayList;

public class Gerenciador {
    private ArrayList<PetShop>petShops;

    public Gerenciador() {
        petShops = new ArrayList<PetShop>();
    }

    public void adicionaPetshop(PetShop petShop) {
        petShops.add(petShop);
    }

    public void gerarMelhorPetShop() {
        double menorPreco = 0.0;
        String melhor = "";
        int menor = 0;

        for (PetShop pet : petShops) {
            double preco = pet.calculateTotalPrice();
            if (menorPreco == 0.0) {
                menorPreco = preco;
            }
            if (preco < menorPreco) {
                menorPreco = preco;
                melhor = pet.getName();
            } else if (preco == menorPreco) {
                PetShop pet2 = pet;
                for (PetShop petShop : petShops) {
                     if (preco == pet2.calculateTotalPrice() && menorPreco == petShop.calculateTotalPrice()) {
                        if (pet2.getDistance() < petShop.getDistance()) {
                            melhor = pet2.getName();
                        } else {
                            melhor = petShop.getName();
                        }
                     }
                }
                if (menor < pet.getDistance()) {
                    menor = pet.getDistance();
                    melhor = pet.getName();
                }
            }
        }

        System.out.printf("O melhor PetShop é: %s \n", melhor);
        System.out.printf("O valor é: %.2f", menorPreco);
    }
}
