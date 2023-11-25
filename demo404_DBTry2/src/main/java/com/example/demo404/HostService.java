package com.example.demo404;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service  
public class HostService  
{
	
	 @Autowired
    private  HostRepository aHostRepository;
	

  

  /*  public List<Host> getallHosts() 
    {
        return new ArrayList<Host>(hosts.values());
    }
*/
    
    public List<Host> getallHosts() 
    {
       
    	return aHostRepository.getallhosts();
    }
    
    
    public Host getHost(int id) {

    	return aHostRepository.getbyId(id);
    }

     
    public Host addHost(Host ahost) {

    	 aHostRepository.save(ahost);
    
        return ahost;
    	
    }

	  
    
	public String removeHost(int id)
	{
		if(aHostRepository.getbyId(id)==null)
		{
			return "Error... Null";
		}
		
		//hosts.remove(id);
		aHostRepository.deleteHost(id);
		return "Removed";
	}
    

 
   
}
