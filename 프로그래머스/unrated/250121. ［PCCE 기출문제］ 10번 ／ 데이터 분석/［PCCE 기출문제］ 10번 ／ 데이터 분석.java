import java.util.*;

class Solution {
    //data: ["코드 번호(code)", "제조일(date)", "최대 수량(maximum)", "현재 수량(remain)"]
    //ext: 어떤 정보를 기준으로 데이터를 뽑아낼지
    //val_ext: 뽑아낼 정보의 기준값
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        //data에서 ext 기준으로 val_ext보다 작은 값만 뽑아서 담기
        List<int[]> extData = new ArrayList<>();
        int extIdx = val(ext);
        for(int i=0; i<data.length; i++){
            if(data[i][extIdx] < val_ext){
                extData.add(data[i]);
            }
        }
        
        // 정렬하기
        int sortIdx = val(sort_by);
        Collections.sort(extData,(o1,o2)->o1[sortIdx]-o2[sortIdx]);
        
        
        int[][] answer = new int[extData.size()][4];
        answer = extData.toArray(answer);
        return answer;
    }
    
    public int val(String str){
        int idx = 0;
        switch(str){
            case "code":
                idx = 0;
                break;
            case "date":
                idx = 1;
                break;
            case "maximum":
                idx = 2;
                break;
            case "remain":
                idx = 3;
                break;
        }
        
        return idx;
    }
}