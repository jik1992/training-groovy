package groovy


@GrabConfig(systemClassLoader=true)
@Grab('org.hsqldb:hsqldb:2.3.0')
import org.hsqldb.Server

class DBUtil {
    static dbSettings = [
            url: 'jdbc:hsqldb:hsql://localhost/cookingdb',
            driver: 'org.hsqldb.jdbcDriver',
            user: 'sa',
            password: ''
    ]

    public static void main(String[] args) {

        Server server = new Server()
        def logFile = new File('db.log')
        server.setLogWriter(new PrintWriter(logFile))
        server.with {
            setDatabaseName(0, 'cookingdb')
            setDatabasePath(0, 'mem:cookingdb')
            start()
        }
        server
    }


}