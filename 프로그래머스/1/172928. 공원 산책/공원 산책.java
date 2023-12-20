class Solution {
    public int[] solution(String[] park, String[] routes) {
        //시작지점 좌표 찾기
        int[] answer = {0,0};
        Loop1 :
        for(int i = 0; i<park.length; i++){
            Loop2 :
            for(int j = 0; j<park[i].length(); j++){
                if(park[i].charAt(j)=='S'){
                    answer[0] = i;
                    answer[1] = j;
                    break Loop1;
                }
            }
        }
        
        //경로 이동 수행
        for(String route : routes){
            char direction = route.charAt(0);
            int n = Character.getNumericValue(route.charAt(2));
            int h = answer[0];//이동후 세로 좌표
            int w = answer[1];//이동후 가로 좌표
            boolean temp = true;
            switch(direction){
                case 'E': 
                    w = (w+n < park[0].length()) ? w+n : w ;
                    for(int i = answer[1] ; i<=w; i++){
                        if(park[h].charAt(i) == 'X'){
                            temp = false;
                            break;
                        }
                    }
                    if(temp)
                        answer[1] = w;
                    break;
                case 'W': 
                    w = (w-n >= 0) ? w-n : w ;
                    for(int i = answer[1] ; i>=w; i--){
                        if(park[h].charAt(i) == 'X'){
                            temp = false;
                            break;
                        }
                    }
                    if(temp)
                        answer[1] = w;
                    break;
                case 'S': 
                    h = (h+n < park.length) ? h+n : h;
                    for(int i = answer[0] ; i<=h; i++){
                        if(park[i].charAt(w) == 'X'){
                            temp = false;
                            break;
                        }
                    }
                    if(temp)
                        answer[0] = h;
                    break;
                case 'N': 
                    h = (h-n >= 0) ? h-n : h;
                    for(int i = answer[0] ; i>=h; i--){
                        if(park[i].charAt(w) == 'X'){
                            temp = false;
                            break;
                        }
                    }
                    if(temp)
                        answer[0] = h;
                    break;
            }
            
        }
        
        return answer;
    }
    
}