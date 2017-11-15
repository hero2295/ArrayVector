
public class ArrayVector {
    double vector[];

    ArrayVector(double vector[]){
        this.vector = vector;
    }

    public double getElement(int num){
        return vector[num];
    }

    public void setElement(int num, double hz){
        vector[num]=hz;
    }

    public int getSize(){
        return vector.length;
    }

    public double norm(){
        double normal=0;
        for(int i=0;i<vector.length; i++){
            normal=vector[i]*vector[i]+normal;
        }
        return Math.sqrt(normal);
    }

    public static void main(String args[]){
        ArrayVector arr1 = new ArrayVector(new double[] {5.6, 1.2, 2.7});
        ArrayVector arr2 = new ArrayVector(new double[] {2.8, 4.6, 7.4});
        System.out.println("Получение элемента вектора: "+arr1.getElement(1));
        arr1.setElement(1, 5.1);
        System.out.println();
        System.out.println("Получение размерности вектора: "+arr1.getSize());
        System.out.println();
        System.out.println("Норма вектора: "+arr1.norm());
        System.out.println();
        System.out.print("Сумма двух векторов: ");
        Vectors.sum(Vectors.arr3, arr2);
        Vectors.arrayOut();
        System.out.println();
        System.out.println();
        System.out.print("Умножение вектора на скаляр: ");
        Vectors.mult(2);
        Vectors.arrayOut();
        System.out.println();
        System.out.println();
        System.out.print("Скалярное произведение векторов: ");
        System.out.println(Vectors.scalarMult(arr1));
        System.out.println();

        LinkedListVector list = new LinkedListVector();

        list.add(15);
        list.add(16);
        list.add(10);

        System.out.println("Does 15 exist?"+" "+list.find(15));
        System.out.println("Does 16 exist?"+" "+list.find(16));
        System.out.println("Does 10 exist?"+" "+list.find(10));
        System.out.println("Does 20 exist?"+" "+list.find(20));
        System.out.println("Does 1 exist?"+" "+list.find(1));


        System.out.println("Deleting 16");
        list.delete(16);
        System.out.println("Does 16 exist?"+" "+list.find(16));
        System.out.println("List size: "+list.getSize());
        System.out.println("List normal: "+list.norm());




    }
}



