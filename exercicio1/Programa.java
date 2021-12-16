import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) throws ParseException {
        
        Scanner entrada = new Scanner(System.in);
        String insertDate;
        int qttBigSize;
        int qttLittleSize;
        System.out.print("Insira um data: ");
        insertDate = entrada.next();
        System.out.print("Insira a quantidadede animais grandes: ");
        qttBigSize = entrada.nextInt();
        System.out.print("Insira a quantidadede animais pequenos: ");
        qttLittleSize = entrada.nextInt();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
        java.util.Date dataFormatada = formato.parse(insertDate);
        Calendar c = Calendar.getInstance();
        c.setTime(dataFormatada);
        Gerenciador gerenciador = new Gerenciador();
        PetShop meuCaninoFeliz;
        PetShop vaiRex;
        PetShop chowChagas;
        if (c.get(Calendar.DAY_OF_WEEK) == 6 || c.get(Calendar.DAY_OF_WEEK) == 1) {
            meuCaninoFeliz = new MeuCaninoFeliz(2000, "Meu Canino Feliz", qttBigSize, (40.0 + (40.0 * 0.2)) , qttLittleSize, (20.0 + (20.0 * 0.2)));
            vaiRex = new VaiRex(1700,"Vai Rex", qttBigSize, 55.0, qttLittleSize, 20.0);
            chowChagas = new ChowChagas(800,"Chow Chagas", qttBigSize, 45.0, qttLittleSize, 30.0);
            gerenciador.adicionaPetshop(meuCaninoFeliz);
            gerenciador.adicionaPetshop(vaiRex);
            gerenciador.adicionaPetshop(chowChagas);
        } else {
            meuCaninoFeliz = new MeuCaninoFeliz(2000, "Meu Canino Feliz", qttBigSize, 40.0 , qttLittleSize, 20.0);
            vaiRex = new VaiRex(1700,"Vai Rex", qttBigSize, 45.0, qttLittleSize, 15.0);
            chowChagas = new ChowChagas(800,"Chow Chagas", qttBigSize, 45.0, qttLittleSize, 30.0);
            gerenciador.adicionaPetshop(meuCaninoFeliz);
            gerenciador.adicionaPetshop(vaiRex);
            gerenciador.adicionaPetshop(chowChagas);
        }
        
        gerenciador.gerarMelhorPetShop();

        entrada.close();
    }
}
