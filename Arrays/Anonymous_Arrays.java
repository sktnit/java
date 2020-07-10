class Anonymous_Arrays{
    public static void main(String args[]) {
        int res=sum(new int[]{10,20,30});
        System.out.print(res);
    }
    public static int sum(int[] a){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}