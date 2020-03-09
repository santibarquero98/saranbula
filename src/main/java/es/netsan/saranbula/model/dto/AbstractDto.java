package es.netsan.saranbula.model.dto;

public interface AbstractDto<T> {
	
	String getTableName();
	T getNew();
	T copy();
	
}