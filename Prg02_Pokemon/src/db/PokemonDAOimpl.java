package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import model.Pokemon;

public class PokemonDAOimpl implements PokemonDAO{

	private Connessione miaConn = new Connessione();
	private Statement istruzionePerDB;
	private ResultSet risultatiDB;
	
	private Map<Integer, Pokemon> mappa = new HashMap<>();
 	
	@Override
	public List<Pokemon> getAllPokemon() {
		// TODO Auto-generated method stub
		return new ArrayList<>(mappa.values());
	}

	@Override
	public Map<Integer, Pokemon> getPokemonMap() {
		
		try {
			this.istruzionePerDB = miaConn.getConn().createStatement();
			this.risultatiDB = this.istruzionePerDB.executeQuery(FINDALL);
			
			while(risultatiDB.next()) {
				int id = risultatiDB.getInt(1);
				String name = risultatiDB.getString(2);
				String type1 = risultatiDB.getString(3);
				String type2 = risultatiDB.getString(4);
				
				Pokemon p = new Pokemon(id, name, type1, type2);
				mappa.put(id, p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return mappa;
	}

	@Override
	public List<Pokemon> getAllPokemonByType(String type) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> getTipiPokemon() {
		Set<String> tipi = new TreeSet<String>();
		
		for (Pokemon p : getAllPokemon()) {
			tipi.add(p.getType1());
			if (!p.getType2().isEmpty()) {
				tipi.add(p.getType2());
			}
		}
		return new ArrayList<>(tipi);
	}

	@Override
	public Pokemon getPokemonById(int id) {
		return mappa.get(id);
	}

	public PokemonDAOimpl() {
		miaConn = new Connessione();
		mappa = new HashMap<>();
		getPokemonMap(); //Mettendo il metodo nel costruttore viene automaticamente popolata la mappa	
	}
	
}
