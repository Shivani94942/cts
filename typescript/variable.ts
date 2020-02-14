function hello() {
    for (var i = 0; i <5; i++)
 {
     console.log(i);
     hi();
     hey(ms);

 }
 hi();
 console.log("outside the loop"+i)
 
}
function hi(){
    for (let i = 0; i < 4; i++) {
        
        console.log(i);
    }
}  
function hey(msg:Number) {
console.log("end of "+msg+"th iteration");    
}
var ms:Number=0;
hello();