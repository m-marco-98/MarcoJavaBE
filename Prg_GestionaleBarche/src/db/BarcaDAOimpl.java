package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Barca;

public class BarcaDAOimpl implements BarcaDAO {

	private Connessione miaConn = new Connessione();
	
	private PreparedStatement ps;
	private ResultSet rs;
	
	@Override
	public ArrayList<Barca> getBarche() {
		
		return null;		
	}

	@Override
	public void addBarca(Barca b) {
		
		try {
			ps = miaConn.getConn().prepareStatement(ADD_BARCA);
			
			ps.setInt(1, b.getCilindrata());
			ps.setInt(2, b.getPosti());
			ps.setDouble(3, b.getPrezzo());
			ps.setString(4, b.getModello());
			ps.setInt(5, b.getStato());
			ps.setInt(6, b.getMatricola());
			ps.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
