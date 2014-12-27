import groovyx.net.http.*

def baseUrl = 'http://news.baidu.com/'
def queryString = ''

def http = new HTTPBuilder(baseUrl)

http.request(Method.POST) {
    send ContentType.URLENC, queryString
    response.success = { response, reader ->
        println response.statusLine
        println reader
    }
    response.failure = { response ->
        println response.statusLine
    }
}