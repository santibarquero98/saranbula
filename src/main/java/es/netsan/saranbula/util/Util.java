package es.netsan.saranbula.util;

public class Util {
	
	public static boolean isNull(Object obj) {
		return obj == null ? Constants.TRUE_BOOLEANVALUE : Constants.FALSE_BOOLEANVALUE;
	}
	
	public static boolean isNullOrBlank(String str) {
		return isNull(str) || str.isEmpty() ? Constants.TRUE_BOOLEANVALUE : Constants.FALSE_BOOLEANVALUE;
	}
	
}
