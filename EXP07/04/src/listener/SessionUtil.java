package listener;

import java.util.ArrayList;
 
import listener.User;
    
public class SessionUtil { 
/* 
 * ����sessionID�����û� 
 */ 
  	public static User getUserBySessionId(ArrayList<User> list,String id){ 
  		for(int i=0;i<list.size();i++){ 
  			if(list.get(i).getSessionIdString().equals(id)){ 
  				return list.get(i); 
  			} 
  		} 
  		return null; 
  	} 
  	/* 
  	 * ����sessionIDɾ���û� 
  	 */ 
  	public static void remove(ArrayList<User> list,String id) { 
  		for(int i=0;i<list.size();i++){ 
  			if(list.get(i).getSessionIdString().equals(id)){ 
  			   list.remove(list.get(i)); 
  			} 
  		} 
  		 
  	} 

}