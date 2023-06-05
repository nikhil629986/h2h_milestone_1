package com.highradius.implementation;

import java.util.List;

import com.highradius.connection.DatabaseConnection;
import com.highradius.model.Invoice;

public class InvoiceDaoImpl implements InvoiceDao {
    private DatabaseConnection dbConnection;

    public InvoiceDaoImpl(){
    	
        this.dbConnection = new DatabaseConnection();
    }

    @Override
    public List<Invoice> getInvoices() {
        return dbConnection.getInvoices();
    }

    @Override
    public void insertInvoice(Invoice invoice) {
        dbConnection.addInvoice(invoice);
    }

    @Override
    public void updateInvoice(int id, Invoice invoice) {
        // Implementation of updating invoice based on ID
        // ...
    }

    @Override
    public void deleteInvoice(int id) {
        // Implementation of deleting invoice based on ID
        // ...
    }
}
