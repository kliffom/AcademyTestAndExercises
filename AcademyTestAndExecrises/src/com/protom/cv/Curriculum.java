package com.protom.cv;

import java.util.ArrayList;
import java.util.List;

public class Curriculum {

	private String nome;
	private List<Job> lavori;
	
	{
		lavori = new ArrayList<>();
	}
	
	public Curriculum(String inNome) {
		this.nome = inNome;
	}
	
	public class Job{

		private String lavoro;
		private int anno;
		
		public Job(String lavoro, int anno) {
			this.lavoro = lavoro;
			this.anno = anno;
		}

		public Job next() {
			
			int index = lavori.indexOf(this); 
			
			if(index<lavori.size()-1)
				return lavori.get(index+1);
			else
				return null;
		}

		@Override
		public String toString() {
			return lavoro + ": " + anno;
		}
		
		
		
	}

	public Job addJob(String lavoro, int anno) {
		
		Job job = new Job(lavoro, anno);
		lavori.add(job);
		return job;
	}
}
