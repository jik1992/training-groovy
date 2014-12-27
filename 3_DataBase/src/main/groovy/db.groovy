package groovy
import groovy.sql.Sql

print "打开数据库".center(20,"=")

dbSettings = [
        url     : 'jdbc:mysql://localhost:3306/demo',
        driver  : 'com.mysql.jdbc.Driver',
        user    : 'root',
        password: 'guanghua'
]


Sql sql = Sql.newInstance(dbSettings)

sql.eachRow('show tables'){x->
        println x[0]
}

