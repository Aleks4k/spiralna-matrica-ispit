package spa_si_ispit;

public class SPA_SI_Ispit {
    public static void main(String[] args) {
        generisi(5,6,2,3);
    }
    
    public static void generisi(int W, int H, int S, int C){
        int[][] matrica = new int[W][H];
        int smer = 0;
        //Smer 0 kretanje na desno.
        //Smer 1 kretanje na dole.
        //Smer 2 kretanje na levo.
        //Smer 3 kretanje na gore.
        int i = 0, j = 0;
        int dodatih = 0;
        while(true){
            if(matrica[i][j] != 0) break;
            matrica[i][j] = S + (dodatih*C);
            dodatih++;
            if(smer == 3) {
                i--;
                if(i <= 0 || matrica[i-1][j] != 0){
                    smer = 0;
                }
            }
            else if(smer == 2){
                j--;
                if(j <= 0 || matrica[i][j-1] != 0){
                    smer = 3;
                }
            }
            else if(smer == 1){
                i++;
                if(i >= matrica.length-1 || matrica[i+1][j] != 0){
                    smer = 2;
                }
            }
            else if(smer == 0){
                j++;
                if(j >= matrica[0].length-1 || matrica[i][j+1] != 0){ //Znaci da smo na poslednjem gde smemo da stavimo broj.
                    smer = 1;
                }
            }
        }
        String ispis = "";
        for(int k = 0; k<matrica.length; k++){
            for(int l = 0; l<matrica[0].length; l++){
                ispis += String.format("%4d ",matrica[k][l]);
            }
            ispis+="\n";
        }
        System.out.println(ispis);
    }
}
