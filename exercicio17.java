import java.util.Scanner;
public class exercicio17{

public static void main(String[] args){

    double area;
    double quantidadelata;
    double mistura;
    double misturapreco;
    double preco;
    double precoM;
    double quantidadelataM;
    double resto;
    double restoM;

    Scanner teclado = new Scanner(System.in);

    System.out.println("Tamamnho em metros quadrados: " );
    area = teclado.nextDouble();

    teclado.close();
    
    quantidadelata = area / (6 * 18);
    resto = area - (6 * 18 * quantidadelata);
    
    if (resto > 0){
        quantidadelata += 1;
    }

    preco = quantidadelata * 80;
    
    quantidadelataM = (int) (area / (6 *3.6));
    restoM = (int) (area - (6*3.6 *quantidadelataM));

    if (restoM > 0){
        quantidadelata += 1;
    }

    precoM = quantidadelata * 25;

    mistura = quantidadelata * quantidadelataM;
    misturapreco = ((preco + precoM)* 0.10) + preco + precoM;

    System.out.println("Latas de 18 litros: ");
    System.out.println("Preço:"+"R$"+ preco);
    System.out.println("Latas de 3,6 litros: ");
    System.out.println("Preço:"+"R$ "+ precoM);
    System.out.println("Mistura das latas: "+ mistura);
    System.out.println("Preço: "+"R$ "+ misturapreco);

}

}