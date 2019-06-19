package soomgosusta.mapper;

import java.util.List;

import soomgosusta.domain.Category;

public interface CategoryMapper {
	List<Category> listSearch();
	List<Category> listCategory();
	int updateSearchLog(String searchCode);
}
