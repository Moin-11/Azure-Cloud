package com.example.demo404;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hosts")
public class HostController {
	
	@Autowired
	private HostService hostService;
	

	
	@GetMapping
    public List<Host> getallHosts() {
        return hostService.getallHosts();
		
    }
    
	@GetMapping(path="{hostid}")
    public Host getHost(@PathVariable("hostid")int id){
        return hostService.getHost(id);
    }

	@PostMapping
    public Host addHost(@RequestBody Host ahost) {
    	return hostService.addHost(ahost);
 
    }
    
    
    
	@DeleteMapping(path="{hostid}")
	public String removeHost(@PathVariable("hostid")int id)
	{
		return hostService.removeHost(id);
	}
 
 
   
    
	
}
