var Rectangle = /** @class */ (function () {
    function Rectangle(l, h) {
        this.length = l;
        this.height = h;
    }
    Rectangle.prototype.getArea = function () {
        var area = Number(this.length) * Number(this.height);
        return area;
    };
    Rectangle.prototype.getParameter = function (l, h) {
        var param = 2 * (l + h);
        return param;
    };
    return Rectangle;
}());
var rect = new Rectangle(10, 20);
console.log(rect);
var area = rect.getArea();
var parameter = rect.getParameter(30, 40);
console.log("Rectangle Area :" + area);
console.log("Reactangle Parameter :" + parameter);
