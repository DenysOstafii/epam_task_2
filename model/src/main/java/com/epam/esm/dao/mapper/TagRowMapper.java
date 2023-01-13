package com.epam.esm.dao.mapper;

import com.epam.esm.entity.Tag;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class TagRowMapper implements ResultSetExtractor<List<Tag>> {

    @Override
    public List<Tag> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Tag> tags = new ArrayList<>();
        while (rs.next()){
            Tag tag = new Tag();
            tag.setId(rs.getInt("tag_id"));
            tag.setName(rs.getString("tag_name"));
            tags.add(tag);
        }
        return tags;
    }
}
