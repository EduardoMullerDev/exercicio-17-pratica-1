import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);

        System.out.printf("Entre com a metragem a ser pintada em m2: ");
        double metragem = teclado.nextDouble();

        teclado.close();
     
        double rendimentoLitros = 6;
        double precoLata = 80.00;
        double volumeLataLitros = 18;
        double precoGalao = 25.00;
        double volumeGalao = 3.6;
        double quantidadeLatas = metragem / (volumeLataLitros * rendimentoLitros);
        double valorTotalLatas = quantidadeLatas * precoLata;
        double quantidadeGaloes = metragem / (volumeGalao * rendimentoLitros);
        double valorTotalGaloes = quantidadeGaloes * precoGalao;
        double metragemMistura = metragem * 1.1;
        
        double quantidadeLatasMistura = metragemMistura / (volumeLataLitros * rendimentoLitros);
        double quantidadeLatasMisturaArredondada = Math.ceil(metragemMistura / (volumeLataLitros * rendimentoLitros));
        double quantidadeDesperdicioLata = quantidadeLatasMisturaArredondada - quantidadeLatasMistura;
        double quatidadeLitrosAConverterEmGaloes = (1 - quantidadeDesperdicioLata) * volumeLataLitros;
        double quantidadeEmGaloesArredondada = Math.ceil(quatidadeLitrosAConverterEmGaloes/volumeGalao);
        double quantidadeEmLataFinal = Math.floor(quantidadeLatasMistura);


     
        System.out.printf("A metragem a ser pintada é de %f metragem", metragem);
        System.out.println("");
        System.out.printf("A quantidade de latas é %f e o valor total em latas é %f", quantidadeLatas, valorTotalLatas);
        System.out.println("");
        System.out.printf("A quantidade de galões é %f e o valor total em galões é %f", quantidadeGaloes, valorTotalGaloes);
        System.out.println("");
        System.out.printf("A metragem para mistura é igual a %f", metragemMistura);
        System.out.println("");
        System.out.printf("quantidade em lata é %f e em galões é % f", quantidadeEmLataFinal, quantidadeEmGaloesArredondada);
  

        
  
  
    }

}