package com.marketingapp.services;

import java.util.List;

import com.marketingapp.entities.Lead;

public interface LeadService {
      
	    public void saveLead(Lead lead);
	    List<Lead> findAllLeads();
		public void deleteLead(long id);
		public Lead findLeadById(long id);
	    
}
