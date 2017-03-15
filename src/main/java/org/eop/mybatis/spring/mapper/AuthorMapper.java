package org.eop.mybatis.spring.mapper;

import java.util.List;

import org.eop.mybatis.spring.bean.Author;

/**
 * @author lixinjie
 */
public interface AuthorMapper {

	int saveAuthor(Author author);
	
	int saveAuthors(List<Author> authors);
	
	int updateAuthor(Author author);
	
	Author getAuthor(Integer id);
	
	int removeAuthor(Integer id);
}
