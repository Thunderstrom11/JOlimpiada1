//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;
import java.util.ArrayList;
void main() {
    ArrayList<String> sucursal = new ArrayList<>();
    ArrayList<Integer> importe = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    while (true){
        System.out.println("Escibre -1 en importe actual para cancelar.");
        System.out.println("Ingresa el nombre de la sucursal ");
        String sucursalActual = sc.nextLine();
        System.out.println("Ingresa el importe de la sucursal ");
        Integer importeActual = sc.nextInt();

        if(importeActual == -1){
            break;
        }

        sucursal.add(sucursalActual);
        importe.add(importeActual);
    }

    int mayorActual = importe.get(0);
    for(int i = 0; i<importe.size(); i++){
        if(importe.get(i) > mayorActual){
            mayorActual = importe.get(i);
        }
    }






}
