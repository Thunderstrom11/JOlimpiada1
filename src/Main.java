//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;
void main() {
    ArrayList<String> sucursal = new ArrayList<>();
    ArrayList<Double> importe = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    System.out.println("Escibre -1 en importe actual para cancelar.");
    while (true){
        System.out.print("Ingresa el nombre de la sucursal > ");
        String sucursalActual = sc.nextLine();
        System.out.print("Ingresa el importe de la sucursal > ");
        int importeActual = sc.nextInt();
        sc.nextLine();

        if(importeActual == -1){
            break;
        }

        sucursal.add(sucursalActual);
        importe.add((double) importeActual);
    }

    if(!importe.isEmpty()){
        Double mayorActual = importe.getFirst();
        int indiceMayor = 0;

        for(int i = 0; i<importe.size(); i++) {
            if (importe.get(i) > mayorActual) {
                mayorActual = importe.get(i);
                indiceMayor = i;
            }
        }

        System.out.println(sucursal.get(indiceMayor) +  " " + importe.get(indiceMayor));
    }
}
