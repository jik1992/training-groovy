import groovy.util.logging.Log

println "hello wolrd\n"
/*
0x00groovy 将自动为我们导入包类
lang
util
net
io
biginteger
bigdecimal
 */
println  "输出一个时间"+new Date().format("yyyyMMdd")
println "test".center(20,'=')
/*
0x01正则
 */
assert '12345'=~/\d+5/
println '123abc'.find(/\d+2/)
def xx=['ab','a','abc'].grep(~/../)
println xx
def matcher='1a2vs2'=~/\S/
println matcher[0]

/*
0x02循环
 */
2.times {println it}
//传递到闭包的每个元素执行一次
new File("test.txt").eachLine {x->println "数据:$x"}
println System.properties
/*
0x03数字提供方法
 */
1.upto(2,{println it})
2.downto(1,{println it})
0.step(0.5,0.1){println it}
/*
0x04集合
 */
def list=["c"]
list.addAll(["a","b"])
println list.grep("a")
println list.collect{x->"$x^_^"}
println list.every{x->x=='a'}
println list.any{x->x=='a'}
println "这是一个列表 $list"
def element=list[1];
println element

//这是一个数组案列,重载了 << 操作符
//对于每个脚本, 最后一行输出即为 return
def map=[:]
map << ["a":123123] <<["b":123123]
println "这是一个数组 $map"

//range 集合
println 1..10
println 1..<10

/*
0x05闭包
 */

/*
0x06断言
*/

/*
0x07GroovyBean
*/
class bean implements Serializable{
    def a;
    def b;
}
new bean().getA()
new bean().getB()
