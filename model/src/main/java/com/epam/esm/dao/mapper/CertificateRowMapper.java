package com.epam.esm.dao.mapper;

import com.epam.esm.entity.Certificate;
import com.epam.esm.entity.Tag;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Component
public class CertificateRowMapper implements ResultSetExtractor<List<Certificate>> {
    @Override
    public List<Certificate> extractData(ResultSet rs) throws SQLException, DataAccessException {
        List<Certificate> certificates = new ArrayList<>();
        rs.next();
        while (!rs.isAfterLast()) {
            Certificate certificate = new Certificate();
            certificate.setId(rs.getInt("id"));
            certificate.setName(rs.getString("name"));
            certificate.setDescription(rs.getString("description"));
            certificate.setDuration(rs.getInt("duration"));
            certificate.setCreateDate(rs.getString("create_date"));
            certificate.setLastUpdateDate(rs.getString("last_update_date"));
            certificate.setPrice(rs.getInt("price"));

            List<Tag> tags = extractTagList(certificate.getId(), rs);
            certificate.setTags(tags);
            certificates.add(certificate);
        }
        return certificates;
    }

    private List<Tag> extractTagList(int certificateId, ResultSet rs) throws SQLException {
        List<Tag> tags = new ArrayList<>();
        while (!rs.isAfterLast()
                && rs.getLong("id") == certificateId
                && rs.getLong("tag_id") != 0) {
            Tag tag = new Tag();
            tag.setId(rs.getInt("tag_id"));
            tag.setName(rs.getString("tag_name"));
            tags.add(tag);
            rs.next();
        }
        if (tags.size() == 0) {
            rs.next();
        }
        return tags;
    }
}
