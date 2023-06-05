package com.highradius.implementation;
import java.util.List;
import com.highradius.model.Invoice;
public interface InvoiceDao {
	 List<Invoice> getInvoices();
	    void insertInvoice(Invoice invoice);
	    void updateInvoice(int id, Invoice updatedInvoice);
	    void deleteInvoice(int id);
	

}
