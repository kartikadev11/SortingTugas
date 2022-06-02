public class BubbleSort {
    private String[] dataTemanku;

    public BubbleSort() {

    }

    public String[] getData() {
        return dataTemanku;
    }

    public void setData(String[] data) {
        this.dataTemanku = data;
    }

    public void sortData() {
        int temanku = this.dataTemanku.length;
        for (int i = 0; i < temanku; i++) {
            for (int j = i + 1; j < temanku; j++) {
                if (this.dataTemanku[j].compareTo(this.dataTemanku[i]) < 0) {
                    String temp = this.dataTemanku[i];
                    this.dataTemanku[i] = this.dataTemanku[j];
                    this.dataTemanku[j] = temp;
                }
            }
        }
    }

    public void printData() {
        for (String datum : this.dataTemanku) {
            System.out.println(datum + " ");
        }
    }

    public static void main(String[] args) {
        String[] nama = {"Kumala","Devi","Eby","Misaki","Yuki","Florine","Sisca","Kevin","Daniel"};
        BubbleSort _myBubble = new BubbleSort();
        _myBubble.setData(nama);
        _myBubble.sortData();
        _myBubble.printData();
    }
}


