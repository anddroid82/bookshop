package hu.webuni.bookshop.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class TitleConverter implements AttributeConverter<String, String> {

	@Override
	public String convertToDatabaseColumn(String attribute) {
		return "T:"+attribute;
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		return dbData.substring(2);
	}
	
}
