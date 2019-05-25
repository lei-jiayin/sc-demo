let arr = [2,5,-10,15]
let [x,y] = arr
x = 2
y = 5

let [,,a,b] = arr
a = -10
b = 15

let [,...rest] = arr
rest = [5,-10,15]

let p = {name="jack",age=23}
let {name,age} = p;
name = "jack"
age = 23
let {n,a} = p;//不能通过n或a取值
let {name:n} = p; //这样可以通过n获取值
n = "jack"

let p = {name="jack",age=23,girl:{name:"rose",age:"18"}}
let {girl:{name}} = p;
name = "rose"
let {...obj} = p;
obj = {name="jack",age=23,girl:{name:"rose",age:"18"}}
obj != p //obj为p的深度复制

//es6
const add = {a,b} => a + b

//对象的函数优化
const p = {
	name: "jack",
	age: "21"
	/*,sayHello: function(){
		console.log("hello");
	}
	sayHello1(){
		console.log("hello es6");
	}*/
}
//p.sayHello();

const hello = function(person){
	console.log(person.name,person.age);
}
const hello = person => console.log(person.name,person.age);

hello(p);

const hello1 = function({name, age}){
	console.log(name,age);
}
//表达式写法
const hello1 = ({name, age}) =>	console.log(name,age);
hello1(p);


//map reduce
let arr = {'2','5','-10','15','-20'}
let arr2 = arr.map(s => parseInt(s))
arr2 = {2,5,-10,15,-20}
arr2.reduce((a,b) => a+b) = -8
arr2.reduce((a,b) => a*b, 0) = 0

