public class Main {
    public static void main(String[] args) {
        int A = 5;
        int B = 14;
        int menor = A;
        char auxPI = 'i'; //p: Pares o i: Impares
//EJERCICIO A
        if (A>B) {
            menor = B;
            B = A;
            A = menor;
        }
        System.out.print("EJERCICIO A: ");
        while(A <= B){
            System.out.print(A + "  ");
            A +=1;
        }
        A = menor;
//EJERCICIO B
        System.out.print("\nEJERCICIO B: ");
        while(A <= B){
            if (A%2==0){
                System.out.print(A + "  ");
            }

            A +=1;
        }
        A = menor;
//EJERCICIO C
        System.out.print("\nEJERCICIO C: ");
        while(A<=B){
            if (A%2==0 && auxPI == 'p'){
                System.out.print(A + "  ");
            }
            else if (A%2!=0 && auxPI == 'i'){
                System.out.print(A + "  ");
            }
            A +=1;
        }
        A = menor;
//EJERCICIO D
        System.out.print("\nEJERCICIO D: ");
        for(int i=B; i>=A; i--){
            if (i%2==0){
                System.out.print(i + "  ");
            }
        }
    }
}