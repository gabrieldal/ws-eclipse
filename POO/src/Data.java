import java.util.Scanner;

public class Data 
{
		
private int dia;
private int mes;
private int ano;

public Data() 
{
	dia =1;
	mes=1;
	ano=1;
}
public void iniciaData(int dia, int mes, int ano) {
	if(dataValida(dia, mes, ano)) {
		this.dia=dia;
		this.mes=mes;
		this.ano=ano;
	}
	else {
		System.out.println("Data invalida! Usando valores default (01/01/01)");
		this.dia=1;
		this.mes=1;
		this.ano=1;
	}
}
public String toString() {
	String d = String.format("%02d,%02d,%02d", dia, mes, ano);
	return d;
}
public boolean dataValida(int dia, int mes, int ano) {
	boolean valida=false;
	if (ano<=0) return valida;
	switch (mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			if ((dia>=1) && (dia<=31))valida =true;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			if ((dia>=1)&& (dia <=30))valida = true;
			break;
		case 2:
			if (((ano%4==0) && (ano%100!=0)) || (ano%400==0)){
                if ((dia>=1) && (dia<=29)) valida=true;
            }
            else{
                if ((dia>=1) && (dia<=28)) valida=true;
	}
	
}return valida;
}
	public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        Data d1 = new Data();
        Data d2 = new Data();
        Data d3 = new Data();
        d1.iniciaData(30,9,2022);
        d2.iniciaData(29,2,2020);
        d3.iniciaData(29,2,2020);
        System.out.println("Data 1: " + d1.toString());
        System.out.println("Data 2: " + d2.toString());
        System.out.println("Data 3: " + d3.toString());
        System.out.println("\nRecebendo uma data pelo teclado (dia+enter, mes+enter e ano+enter)");
        d1.iniciaData(input.nextInt(),input.nextInt(),input.nextInt());
        System.out.println("\nData: " + d1.toString());
    }
}
