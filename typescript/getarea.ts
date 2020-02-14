class Rectangle{
   private length: Number;
   private height: Number;

   constructor(l,h){
       this.length=l;
       this.height=h;
   }

getArea():Number {

    let area=Number(this.length) * Number(this.height);
    return area;
}
getParameter(l:any,h:any):any{
    let param=2 * (l+h);
    return param; 
}
    
}

var rect = new Rectangle(10,20);
console.log(rect);
var area=rect.getArea();
var parameter=rect.getParameter(30,40);
console.log("Rectangle Area :"+area);
console.log("Reactangle Parameter :"+parameter);