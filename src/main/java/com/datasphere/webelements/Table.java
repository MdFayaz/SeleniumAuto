package com.datasphere.webelements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Table extends GenericWebElement {

	// By default, table header
	int rowSize = 1;
	public HashMap<String, String> tableColToValueMap = new HashMap<String, String> ();
	
    Table(WebElement underlyingElement) {
		super(underlyingElement);
		System.out.println("Table: " + underlyingElement);
	}
    
    public void search(String nameToSearch) {
    	System.out.println("getUnderlyingElement: " + getUnderlyingElement());
    	WebElement searchText = getUnderlyingElement().findElement(By.name("searchName"));
    	searchText.clear();
    	searchText.sendKeys(nameToSearch);
    }
    
    /**
     * Get the table size.
     */
    public int getTableDataSize() {
       return getTableData().size();
    }
    
    /**
     * Get the table rows - including headers
     */
    public List<WebElement> getTableRows() {
    	return getUnderlyingElement().findElements(By.tagName("tr"));
    }
    
    /**
     * Get table data - excluding headers
     */
    public List<WebElement> getTableData() {
    	return getUnderlyingElement().findElements(By.xpath("//tbody//tr"));
    }
    
    /**
     * @return - the first row of the table
     */
    public WebElement getFirstRow() {
    	WebElement firstRow = null;
    	if(getTableDataSize() >= 1) {
    		firstRow = getTableData().get(0);
    	}
    	return firstRow;
    }

    /**
     * @return - the list of table headers
     */
    public List<String> getTableHeaders() {
    	ArrayList<String> tableHeadersList = new ArrayList<String>();
        List<WebElement> tableHeaders = getUnderlyingElement().findElements(By.tagName("th"));
        for(WebElement tableHeader : tableHeaders) {
        	String headerText = tableHeader.getText();
        	System.out.println("headerText: " + headerText);
        	tableHeadersList.add(headerText);
        }
        return tableHeadersList;
    }
    
    public List<String> getRowCellData() {
    	ArrayList<String> tableCellDataList = new ArrayList<String>();
    	List<WebElement> tableCellsData = getFirstRow().findElements(By.tagName("td"));
    	for(WebElement tableCellData : tableCellsData) {
    		String cellData = tableCellData.getText();
    		System.out.println("Cell Data: " + cellData);
    		tableCellDataList.add(cellData);
    	}
    	return tableCellDataList;
    }
    
    public void mapColToName() {
    	int tableHeadersSize = getTableHeaders().size();
    	int tableRowCellDataSize = getRowCellData().size() - 1;
    	System.out.println("tableHeadersSize: " + tableHeadersSize);
    	System.out.println("tableRowCellDataSize: " + tableRowCellDataSize);
    	if(tableHeadersSize == tableRowCellDataSize) {
    		for(int index = 0; index < getTableHeaders().size() - 1; index++ ) {
    			tableColToValueMap.put(getTableHeaders().get(index), getRowCellData().get(index));
    		}
    	}
    }
    
    public String getTableColData(String colValue) {
    	mapColToName();
    	String cellData = "";
    	if(tableColToValueMap.containsKey(colValue)) {
    		tableColToValueMap.get(colValue);
    	}
    	return cellData;
    }
}