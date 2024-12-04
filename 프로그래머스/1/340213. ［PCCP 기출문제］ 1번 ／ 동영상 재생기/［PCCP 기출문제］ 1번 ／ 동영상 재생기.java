class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        StringBuilder sb= new StringBuilder();
        
    	String[] video = video_len.split(":|\"");
        String[] pos_s = pos.split(":|\"");
        String[] ops = op_start.split(":|\"");
        String[] ope = op_end.split(":|\"");
        
        int video_t = Integer.parseInt(video[0])*60 + Integer.parseInt(video[1]);
        int pos_t = Integer.parseInt(pos_s[0])*60 + Integer.parseInt(pos_s[1]);
        int ops_t = Integer.parseInt(ops[0])*60 + Integer.parseInt(ops[1]);
        int ope_t = Integer.parseInt(ope[0])*60 + Integer.parseInt(ope[1]);
        
        for(int i = 0 ; i < commands.length ; i++) {
        	if(commands[i].equals("next")) {
        		if(pos_t>=ops_t && pos_t<=ope_t) {
        			pos_t = ope_t+10;
        		}else {
        			pos_t += 10;
        		}
        		if(pos_t > video_t) {
        			pos_t = video_t;
        		}
        		if(pos_t>=ops_t && pos_t<=ope_t) {
        			pos_t = ope_t;
        		}
        	}else {
        		if(pos_t>=ops_t && pos_t<=ope_t) {
        			pos_t = ope_t-10;
        		}else {
        			pos_t -= 10;
        		}
        		if(pos_t < 0) {
        			pos_t = 0;
        		}
                
        		if(pos_t>=ops_t && pos_t<=ope_t) {
        			pos_t = ope_t;
        		}
                
        	}      	
        }
        
        int mm = pos_t/60;
        int ss = pos_t%60;
        
        if(mm<10) {
        	sb.append("0");
        	sb.append(mm);
        }else {
        	sb.append(mm);
        }
        sb.append(":");
        if(ss<10) {
        	sb.append("0");
        	sb.append(ss);        	
        }else {
        	sb.append(ss);        	        	
        }

        return sb.toString();
    }
}