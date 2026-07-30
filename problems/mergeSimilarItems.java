class Solution{
    public List<List<Integer>> mergeSimilarItems(int[][] items1,int[][] items2){
        List<List<Integer>> list=new ArrayList<>();
        boolean[] visited=new boolean[items2.length];
        for(int i=0;i<items1.length;i++){
            boolean found=false;
            for(int j=0;j<items2.length;j++){
                if(items1[i][0]==items2[j][0]){
                    int item=items1[i][1]+items2[j][1];
                    list.add(Arrays.asList(items1[i][0],item));
                    visited[j]=true;
                    found=true;
                    break;
                }
            }
            if(!found){
                list.add(Arrays.asList(items1[i][0],items1[i][1]));
            }
        }
        for(int j=0;j<items2.length;j++){
            if(!visited[j]){
                list.add(Arrays.asList(items2[j][0],items2[j][1]));
            }
        }
        list.sort((a,b)->a.get(0)-b.get(0));
        return list;
    }
}