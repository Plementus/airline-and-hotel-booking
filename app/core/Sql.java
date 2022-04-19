package core;
/********************************************/
//	6/13/15 1:02 PM - Ibrahim Olanrewaju.
/********************************************/
import play.Configuration;
import play.Logger;
import play.db.DB;
import java.sql.*;
import java.util.*;

public class Sql {

    public static Sql instance = null;

    public static Connection connection;

    public String lastId;

    public String lastQuery;

    public String query;

    public String tableName;

    private static final Configuration appConfig = Configuration.root();

    private static final String DB_URL = appConfig.getString("db.default.url");

    private static final String DB_USER = appConfig.getString("db.default.root");

    private static final String DB_PASS = appConfig.getString("db.default.root");

    public static Sql getInstance() {
        if (instance == null) {
            instance = new Sql();
            try {
                instance.openConnection();
                if (connection == null) {
                    //Create a new connection from the driver manage
                    instance.createNewConnection();
                }
            } catch (SQLException | ClassNotFoundException ex) { }
        }
        return instance;
    }

    private void createNewConnection() throws SQLException, ClassNotFoundException {
        Configuration conf = Configuration.root();
        connection = DriverManager.getConnection(DB_URL, DB_URL, DB_PASS);
    }

    public Connection getConnection() {
        return connection;
    }

    public Object insert(String sqlQuery) throws SQLException{
        PreparedStatement statement = connection.prepareStatement(sqlQuery, Statement.RETURN_GENERATED_KEYS);
        int isRowAffected = statement.executeUpdate();
        if (isRowAffected == 0) {
            return false;
        }
        ResultSet affectedRow = statement.getGeneratedKeys(); affectedRow.next();
        this.lastId = Integer.toString(affectedRow.getInt(1));
        return affectedRow.getInt(1);
    }


    /**
     *
     * @param sqlQuery
     * @return List<String> List of Auto Generated Keys
     * @throws SQLException
     */
    public List<Object> insert(List<String> sqlQuery) throws SQLException{
        if (sqlQuery.size() == 0) {
            return null;
        }
        List<Object> lastId = new ArrayList<>();
        for (String qr: sqlQuery) {
            PreparedStatement statement = connection.prepareStatement(qr, Statement.RETURN_GENERATED_KEYS);
            statement.executeUpdate();
            ResultSet affectedRow = statement.getGeneratedKeys();
            affectedRow.next();
            lastId.add(Integer.toString(affectedRow.getInt(1)));
            this.lastQuery = qr;
        }
        return lastId;

    }

    public Boolean execute(String sqlQuery)  {
        try {
            this.lastQuery = sqlQuery;
            return connection.createStatement().execute(sqlQuery);
        }catch (SQLException ex) {
            return false;
        }
    }

    public ResultSet executeQuery(String sqlQuery) {
        ResultSet result = null;
        try {
            this.lastQuery = sqlQuery;
            Statement statement = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            result = statement.executeQuery(sqlQuery);
        }catch (SQLException ex) {}
        return result;
    }

    private void openConnection() throws SQLException {
        connection = DB.getConnection();
    }


    public void release() {
        try {
            connection.close();
        }catch (SQLException e) {
            Logger.debug("Error in closing DB Connection: " + e.getMessage());
        }
    }

    public Sql select(String tableName) {
        this.query = "SELECT * from " + tableName + " ";
        this.tableName = tableName;
        return this;
    }

    public Sql where(String where, String cond, String value) {
        this.query += "WHERE "+where + " "+cond+" '"+value+"'";
        return this;
    }

    public Sql join(String tableName, String joinColumn,  String condition, String joinColumnAgainst) {
        this.query +=" JOIN "+tableName + " ON '"+joinColumn+"' "+ condition + " '"+joinColumnAgainst+"'";
        return this;
    }

    public Sql leftJoin(String tableName, String joinColumn,  String condition, String joinColumnAgainst) {
        this.query +=" LEFT JOIN "+tableName + " ON '"+joinColumn+"' "+ condition + " '"+joinColumnAgainst+"'";
        return this;
    }

    public Sql innerJoin(String tableName, String joinColumn,  String condition, String joinColumnAgainst) {
        this.query +=" INNER LEFT "+tableName + " ON '"+joinColumn+"' "+ condition + " '"+joinColumnAgainst+"'";
        return this;
    }

    public Sql order(String columnName, String sort) {
        this.query += " ORDER BY " + columnName + " " + sort;
        return this;
    }


    public Sql fields(String[] selectFields) {
        for (String field: selectFields) {

        }
        return this;
    }

    public String toSql() {
        return this.query;
    }

    @Override
    public String toString() {
        return toSql();
    }

}
