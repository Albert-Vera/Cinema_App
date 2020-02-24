import model.Pelis;
import model.Sales;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PercentatgesPieChar {

    List<Integer> retorno = new ArrayList<>();
    List<Integer> retornoPelis = new ArrayList<>();

    public List<Integer> percentatgeIdioma(List<Pelis> llistaPelis){
        int frances= 0;
        int angles= 0;
        int castella= 0;
        int catala= 0;
        int alemany= 0;
        int italia= 0;

        try{
             frances = (int) llistaPelis.stream().filter(x -> x.getIdioma().contains("francès"))
                    .count();
            angles = (int) llistaPelis.stream().filter(x -> x.getIdioma().contains("anglès"))
                    .count();
            castella = (int) llistaPelis.stream().filter(x -> x.getIdioma().contains("castellà"))
                    .count();
            catala = (int) llistaPelis.stream().filter(x -> x.getIdioma().contains("català"))
                    .count();
            alemany = (int) llistaPelis.stream().filter(x -> x.getIdioma().contains("alemany"))
                    .count();
            italia = (int) llistaPelis.stream().filter(x -> x.getIdioma().contains("italià"))
                    .count();
            retornoPelis.add(frances);
            retornoPelis.add(angles);
            retornoPelis.add(castella);
            retornoPelis.add(catala);
            retornoPelis.add( alemany);
            retornoPelis.add( italia);
        }catch (Exception e){
            System.out.println("Ha hagut un error al calcula percentages");
        }
        return retornoPelis;
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
