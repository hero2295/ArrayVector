

public class Vectors {
    static ArrayVector arr3 = new ArrayVector(new double[] {2.1, 3.4, 5.5});

    public static ArrayVector sum(ArrayVector anarr, ArrayVector curarr){
        for (int i = 0; i<anarr.getSize(); i++) {
            anarr.vector[i] = curarr.getElement(i) + anarr.vector[i];
            if(anarr.vector[i]>anarr.getSize() || curarr.vector[i]>curarr.getSize()){
                throw new VectorIndexOutOfBoundsException("At least one of vectors is out of bounds!");
            }
        }

        return anarr;
    }

    public static ArrayVector mult(int n){
        for(int i=0; i<arr3.getSize(); i++){
            arr3.vector[i] = arr3.getElement(i)*n;
            if(arr3.vector[i]>arr3.getSize()){
                throw new VectorIndexOutOfBoundsException("At least one of vectors is out of bounds!");
            }
        }
        return arr3;
    }

    public static double scalarMult(ArrayVector arr){
        double a=0;
        for (int i = 0; i <arr3.getSize(); i++) {
            a = arr3.getElement(i) * arr.vector[i]+a;
        }
        return a;
    }

    public static void arrayOut(){
        for(int i=0; i<arr3.getSize(); i++){
            System.out.print(arr3.getElement(i)+" ");
        }
    }

}
