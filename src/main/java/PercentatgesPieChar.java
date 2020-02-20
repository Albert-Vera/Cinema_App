import model.Pelis;
import model.Sales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PercentatgesPieChar {

    List<Integer> retorno = new ArrayList<>();

    public List<Integer> percentatgeProvincias(List<Sales> llistaSales){

        try {
            int barcelona = (int) llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Barcelona"))
                    .count();
            int girona = (int) llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Girona"))
                    .count();
            int tarragona = (int) llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Tarragona"))
                    .count();
            int lleida = (int) llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Lleida"))
                    .count();
            int illes  = (int) llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Illes Balears"))
                    .count();
            System.out.println("metode percentatge: " + barcelona);
            retorno.add(barcelona);
            retorno.add(girona);
            retorno.add(tarragona);
            retorno.add(lleida);
            retorno.add( illes);
        }catch (Exception e){
            System.out.println("Ha hagut un error al calcula percentages");
        }
        return retorno;
    }
}
