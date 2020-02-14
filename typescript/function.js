function draw(dimension) {
    console.log(dimension.a);
    console.log(dimension.b);
}
function drag(dimen) {
    console.log(dimen.c);
    console.log(dimen.d);
}
draw({
    a: "hey",
    b: "hello"
});
drag({
    c: "true",
    d: "false"
});
