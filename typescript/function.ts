function draw(dimension:{a:any,b:any}) {
    console.log(dimension.a);
    console.log(dimension.b);

}

//OR

interface Dimen 
{
    c:any,
    d:any
}
function drag(dimen:Dimen) {
    console.log(dimen.c);
    console.log(dimen.d);
}
  
draw(
    {
        a:"hey",
        b:"hello"
    }
)

drag({
    c: "true",
    d:"false"
})
