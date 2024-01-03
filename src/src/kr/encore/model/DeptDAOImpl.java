package kr.encore.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

// @Component("dao")
@Component   // deptDAOImpl bean 생성 , <bean id="deptDAOImpl" class="kr.encore.model.DeptDAOImpl" />
public class DeptDAOImpl implements DeptDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;  // DML 명령어 처리 
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	@Override
	public List deptList() { // select 
		String sql = "SELECT * FROM dept ORDER BY deptno desc";
		return jdbcTemplate.queryForList(sql);
	}

	@Override
	public void deptInsert(DeptDTO dto) { // insert 
		String sql = "INSERT INTO dept(deptno, dname, loc) values (?,?,?)";
		Object[] arr = {dto.getDeptno(), dto.getDname(), dto.getLoc()};
		jdbcTemplate.setResultsMapCaseInsensitive(true);
		this.jdbcTemplate.update(sql, arr);	
	}

}
