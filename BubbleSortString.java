package BubbleSort;

public class BubbleSortString {
    private String[] nama;

    public BubbleSortString(){
    }

    public String[] getNama(){
        return nama;
    }

    public void setNama(String[] nama) {
        this.nama = nama;
    }

    public void SortData(){
        for (int i=0;i<this.nama.length;i++){
            for (int j=i+1;j<this.nama.length;j++){
                if (this.nama[j].compareToIgnoreCase(this.nama[i])<0){
                    String temp = this.nama[i];
                    this.nama[i] = this.nama[j];
                    this.nama[j] = temp;
                }
            }
        }
    }

    public void PrintData(){
        for (String dataNama:this.nama){
            System.out.println(dataNama+" ");
        }
    }

    public static void main(String[] args) {
        String[] teman = {"Amelia","Samsul","Afwan","Nur","Rama","Ezra","Faizin","Fian","Aji","Fauzi"};
        BubbleSortString urut = new BubbleSortString();
        urut.setNama(teman);
        urut.SortData();
        urut.PrintData();
    }
}

