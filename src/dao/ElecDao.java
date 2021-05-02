package dao;
import java.sql.ResultSet;  
import java.sql.SQLException;  
import java.util.List;  
import org.springframework.jdbc.core.BeanPropertyRowMapper;  
import org.springframework.jdbc.core.JdbcTemplate;  
import org.springframework.jdbc.core.RowMapper;  

import bean.Elec;


public class ElecDao {
	JdbcTemplate template;

	public JdbcTemplate getTemplate() {
		return template;
	}

	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	public int save(Elec p)
	{
		String sql="insert into electricitybill(conId,conName,amt) values("+p.getConId()+",'"+p.getConName()+"',"+p.getAmt()+")";
	    return template.update(sql);
	}
	
	
	public int update(Elec s)
	{
		String sql="update electricitybill set conName='"+s.getConName()+"',amt="+s.getAmt()+" where conId="+s.getConId()+"";
		return template.update(sql);
				
	}
	public int delete(int conId)
	{
		String sql="delete from electricitybill where conId="+conId+"";
		return template.update(sql);
	}
	
	public Elec getElecById(int conId)
	{  
	    String sql="select * from electricitybill where conId=?";  
	    return template.queryForObject(sql, new Object[]{conId}, new BeanPropertyRowMapper<Elec>(Elec.class));  
	}  
	
	
	
	public List<Elec> getBill()
	{
		return template.query("select * from electricitybill", new RowMapper<Elec>()
	    {  
	        public Elec mapRow(ResultSet rs, int row) throws SQLException 
	        {  
	            Elec e=new Elec();  
	            e.setConId(rs.getInt(1));  
	            e.setConName(rs.getString(2));  
	            e.setAmt(rs.getDouble(3));  
	              
	            return e;  
	        }  
	    });  
	}

}
