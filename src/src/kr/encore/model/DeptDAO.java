package kr.encore.model;

import java.util.List;

public interface DeptDAO {
	
	public List deptList(); // selectAll
	public void deptInsert(DeptDTO dto);
	
}
