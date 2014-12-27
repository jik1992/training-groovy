@Grab(group='org.ccil.cowan.tagsoup', module='tagsoup', version='0.9.7')
def getHtml() {
    def parser = new XmlParser(new org.ccil.cowan.tagsoup.Parser())
    parser.parse("http://www.ituring.com.cn/book/1294")
}
html.body.'**'.a.@href.grep(~/.*\.pdf/).each{ println it }
