package com.example.demo404;
import org.springframework.data.annotation.Id;
import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;
import com.azure.spring.data.cosmos.core.mapping.PartitionKey;

@Container(containerName = "Hosts")
public class Host {

    @Id
    @PartitionKey
    private String id;
    private int pe;
    private int ram;

    public Host() {
    }

    @JsonCreator
    public Host(@JsonProperty("id") String id, 
                @JsonProperty("pe") int pe, 
                @JsonProperty("ram") int ram) {
        this.id = id;
        this.pe = pe;
        this.ram = ram;
    }
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getPe() {
		return pe;
	}
	public void setPe(int pe) {
		this.pe = pe;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
}