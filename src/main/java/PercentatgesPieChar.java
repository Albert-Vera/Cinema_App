import model.Pelis;
import model.Sales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PercentatgesPieChar {

    List<Integer> retorno = new ArrayList<>();

    public List< Integer> percentatgeIdioma(List<Pelis> llistaPelis){
        List<Integer> retornoIdioma = new ArrayList<>();

        try{
        System.out.println("lista piniculas al entrar: " + llistaPelis.size());
//            List<Pelis> sList = llistaPelis.stream().filter(x -> !x.getIdioma().isEmpty()).collect(Collectors.toList());
//            for(Pelis a: sList){
//                System.out.println(a.getIdioma());
//            }

            Long catala =  llistaPelis.stream().filter(x -> x.getTitol().contains("à"))
                    .count();
            System.out.println("en catala: " + catala.intValue());

            retornoIdioma.add(Math.toIntExact(catala));
        }catch (Exception e){
            System.out.println("Ha hagut un error al calcula percentages");

        }
        System.out.println("retorno: " +retornoIdioma.size());
        return retornoIdioma;
    }
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
            retorno.add((int) barcelona);
            retorno.add((int) girona);
            retorno.add((int) tarragona);
            retorno.add((int) lleida);
            retorno.add((int) illes);
        }catch (Exception e){
            System.out.println("Ha hagut un error al calcula percentages");
        }





        return retorno;
    }
}
