import model.Sales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PercentatgesPieChar {

    List<Sales> listDatos = new ArrayList<>();
    List<Long> retorno = new ArrayList<>();
    Sales sales = new Sales();

    public List<Long> percentatgeProvincias(List<Sales> llistaSales){


        Long barcelona  = llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Barcelona"))
                .count();
        System.out.println(barcelona);
        Long girona  = llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Girona"))
                .count();
        System.out.println(girona);
        Long tarragona  = llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Tarragona"))
                .count();
        System.out.println(tarragona);
        Long lleida  = llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Lleida"))
                .count();
        System.out.println(lleida);
        Long illes  = llistaSales.stream().filter(x -> x.getProvincia().equalsIgnoreCase("Illes Balears"))
                .count();
        System.out.println(illes);

        barcelona = (barcelona / 101 *100) *100;
        girona = (girona / 101 *100) *100;
        lleida = (lleida / 101 *100) *100;
        tarragona = (tarragona / 101 *100) *100;
        illes = (illes / 101 *100) *100;

        retorno.add(barcelona);
        retorno.add(girona);
        retorno.add(tarragona);
        retorno.add(lleida);
        retorno.add(illes);


        return retorno;
    }
}
