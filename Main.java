public class Main {

    static boolean varMı(int[] list,int say){
        for (int i:list){
            if (i==say){
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20};
        int[] bosList = new int[list.length];
        int count=0;
        for (int i : list){
            int tekrarSay=0;

            for (int j =0;j<list.length;j++){
                if (i==list[j]){
                    tekrarSay++;
                }
            }
            if(!varMı(bosList,i)){
                System.out.println(i+"sayısı Tekrar sayısı : "+ tekrarSay);
            }
            bosList[count]=i;
            count++;

        }

    }
}