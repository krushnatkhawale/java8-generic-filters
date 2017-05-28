package com.java.functional.filter.util;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterUtils {

	
	/**
	 * @param stream
	 * @param filters
	 * @return filtered stream of Given type
	 */
	public static <T> Stream<T> getFilteredStream(Stream<T> stream, List<Predicate<T>> filters){
		return filters.isEmpty() ? stream : applyFilters(stream, filters, filters.size()-1);
	}
	
	
	/**
	 * @param stream
	 * @param filters
	 * @return filtered stream of Given type
	 */
	public static <T> Stream<T> applyFilters(Stream<T> stream, List<Predicate<T>> filters, int index){
		return index>ZERO ? applyFilters(stream.filter(filters.get(index)), filters, index-1) : stream.filter(filters.get(index));
	}
	
	
	final static int ZERO = 0;
}
